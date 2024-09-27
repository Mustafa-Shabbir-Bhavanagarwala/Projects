<h1 align="center">Socioeconomic Factors and ACT Scores: Data-Driven Analysis & Prediction</h1>

<p align="right"><b>By: Mustafa Shabbir Bhavanagarwala</b></p>

## Abstract
<p>This project is based on the study of inequality of educational opportunity in U.S. high schools. Here the focus is on average student performance on the ACT or SAT exams that students take as part of the college application process. There is a range of school performance on these exams, but the project focuses on whether school performance can be predicted by socioeconomic factors. A number of factors are focused on such as unemployment rate, median income, and marital status. A number of machine learning models are implemented, with Random Forest Regressor giving the best results. The project is helpful in Education policy development, resource allocation & targeting educational programs to reduce educational inequality.</p>

## Introduction
<p>In this project, two datasets are made use. The primary data set is the EdGap data set from EdGap.org. This data set from 2016 includes information about average ACT or SAT scores for schools and several socioeconomic characteristics of the school district. Some of the features of the dataset are the unemployment rate, marital status & percentage of college attended. The secondary data set is basic information about each school from the National Center for Education Statistics. Significant factors of the dataset include school id, school type & school level. </p>

## Methodology
<p>1.	Data Collection: The socioeconomic data is collected from EdGap. school information data is from the National Center for Education Statistics org while the school information data is from the National Center for Education Statistics.</p>

<p>2.	Data Preprocessing: Eliminated unimportant features from the two datasets. Renamed the columns and joined both the data frames of the two datasets using the identity of the school as the key. The rows corresponding to the missing values of the target variable are dropped. After train-test-split, scaling and imputation are carried out.</p>

<p>3.	Modeling: The machine learning algorithms implemented for the prediction are the OLS method of least squares and the Random Forest Regressor. Design matrices are generated for train and test sets. The parameters focused on hyperparameter tuning for the Random Forest regressor model are Maximum Depth, Number of Trees, & Minimum number of samples. The model is trained using the best hyperparameters found by Randomized Search CV to predict the average ACT score.</p>
<p>4.	Evaluation: The models were evaluated using metrics such as Root Mean Square Error, Mean Absolute Error & R-squared.</p>

Computational Results

<table border="1" cellpadding="5" cellspacing="0">
  <tr>
    <th>Performance metrics</th>
    <th>OLS method</th>
    <th>Random Forest regressor</th>
  </tr>
  <tr>
    <td>Mean Square Error</td>
    <td>1.457</td>
    <td>1.406</td>
  </tr>
  <tr>
    <td>Mean Absolute Error</td>
    <td>1.107</td>
    <td>1.063</td>
  </tr>
  <tr>
    <td>R-squared</td>
    <td>0.622</td>
    <td>0.676</td>
  </tr>
</table>


## Conclusion
<p>Out of the machine learning models implemented, the Random Forest Regressor delivered the best results with MSE being 1.406. Eligibility for free or reduced-price lunch came out to be the most important feature for the study and prediction. Future enhancements can be including additional census data. Advanced modelling techniques can be used such as Neural Networks for Regression and Bayesian Modeling.</p>
