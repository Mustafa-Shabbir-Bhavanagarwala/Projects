    # Read in raw data
    rawData <- read_csv("data.csv")

    ## Rows: 260 Columns: 17
    ## ── Column specification ────────────────────────────────────────────────────────
    ## Delimiter: ","
    ## chr (17): Country Name, Country Code, Series Name, Series Code, 2010 [YR2010...
    ## 
    ## ℹ Use `spec()` to retrieve the full column specification for this data.
    ## ℹ Specify the column types or set `show_col_types = FALSE` to quiet this message.

    # Clean
    clean <- rawData %>% 
      select(-`Country Code`, -`Series Code`) %>% 
      mutate(across(everything(), ~as.character(.))) %>% 
      distinct(`Country Name`, `Series Name`, .keep_all = T) %>% 
      pivot_longer(cols = starts_with("20"),
                   names_to = "Year") %>% 
      pivot_wider(names_from = "Series Name", values_from = "value") %>% 
      filter(!is.na(`Country Name`) & !(`Country Name` %in% c("Data from database: World Development Indicators", "Last Updated: 11/13/2024"))) %>% 
      select(-`NA`)

    # Clean names
    clean_names <- clean %>% 
      rename(country_name = `Country Name`,
             year = Year,
             elec_access = `Access to electricity (% of population)`,
             agri_land = `Agricultural land (% of land area)`,
             agri_forest_fish = `Agriculture, forestry, and fishing, value added (% of GDP)`,
             arable_land = `Arable land (% of land area)`,
             armed_forces_perc = `Armed forces personnel (% of total labor force)`,
             armed_forces_total = `Armed forces personnel, total`,
             birth_rate = `Birth rate, crude (per 1,000 people)`,
             educ_expend = `Government expenditure on education, total (% of GDP)`,
             tourism = `International tourism, expenditures (current US$)`,
             mortality = `Mortality rate, infant (per 1,000 live births)`,
             pop = `Population, total`,
             health_expend = `Current health expenditure (% of GDP)`,
             gdp_usd = `GDP (current US$)`,
             gdp_perc = `GDP per capita growth (annual %)`,
             income = `Adjusted net national income (current US$)`) %>% 
      mutate(across(-c(country_name, year), as.numeric))

    ## Warning: There were 9 warnings in `mutate()`.
    ## The first warning was:
    ## ℹ In argument: `across(-c(country_name, year), as.numeric)`.
    ## Caused by warning:
    ## ! NAs introduced by coercion
    ## ℹ Run `dplyr::last_dplyr_warnings()` to see the 8 remaining warnings.

    # Imputation dataframe
    data <- clean_names

    cols_to_numeric <- c("elec_access", "agri_land", "agri_forest_fish", "arable_land",
                         "armed_forces_perc", "armed_forces_total", "birth_rate",
                         "educ_expend", "tourism", "mortality", "pop", "gdp_usd",
                         "gdp_perc", "health_expend", "income")

    data[cols_to_numeric] <- lapply(data[cols_to_numeric], as.numeric)

    data <- data %>%
      mutate(year = as.integer(sub("\\[.*\\]", "", as.character(year))))

    # Custom function to handle Kalman imputation with a fallback
    impute_kalman_fallback <- function(x) {
      tryCatch({
        if (sum(!is.na(x)) >= 3) {
          na_kalman(x)  # Apply Kalman filter if there are enough points
        } else {
          na.locf(x, na.rm = FALSE)  # Fallback to forward fill if not enough points
        }
      }, error = function(e) {
        na.locf(x, na.rm = FALSE)  # Fallback to forward fill on error
      }, warning = function(w) {
        na_interpolation(x)  # Use linear interpolation as fallback on warning
      })
    }

    # List of columns to impute (numeric columns)
    numeric_cols <- names(data)[sapply(data, is.numeric)]


    # Apply imputation with fallback for each numeric column grouped by 'country_name'
    data_imputed <- data %>%
      group_by(country_name) %>%
      mutate(across(all_of(numeric_cols), impute_kalman_fallback)) %>%
      ungroup()

    # View the result
    head(data_imputed)

    ## # A tibble: 6 × 17
    ##   country_name  year elec_access agri_forest_fish agri_land arable_land
    ##   <chr>        <int>       <dbl>            <dbl>     <dbl>       <dbl>
    ## 1 Viet Nam      2010        97.4             15.4      34.3        20.5
    ## 2 Viet Nam      2011        99               16.3      34.4        20.5
    ## 3 Viet Nam      2012        97.9             16.2      34.4        20.4
    ## 4 Viet Nam      2013        98.5             15.2      34.7        20.5
    ## 5 Viet Nam      2014        99.2             14.9      34.7        20.5
    ## 6 Viet Nam      2015        99.3             14.5      38.8        22.3
    ## # ℹ 11 more variables: armed_forces_perc <dbl>, armed_forces_total <dbl>,
    ## #   birth_rate <dbl>, educ_expend <dbl>, tourism <dbl>, mortality <dbl>,
    ## #   pop <dbl>, health_expend <dbl>, gdp_usd <dbl>, income <dbl>, gdp_perc <dbl>

    #write.csv(data_imputed, file = "cleaned_data.csv")
