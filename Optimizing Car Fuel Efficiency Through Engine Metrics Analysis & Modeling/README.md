<h1 align="center">Optimizing Car Fuel Efficiency Through Engine Metrics Analysis & Modeling</h1>

<p align="right"><b>By: Mustafa Shabbir Bhavanagarwala</b></p>

## Abstract
<p>This project focuses on determining the relationship between the car’s engine performance metrics with its fuel efficiency measured in the miles per gallon. The above project can be applied to automotive fuel efficiency predictions, helping manufacturers optimize engine performance and meet emissions standards. Additionally, it can assist consumers in choosing vehicles based on fuel economy, supporting environmental sustainability and cost savings.</p>

## Introduction
<p>The project uses the cars dataset which includes features like 'Name', 'Miles_per_Gallon', 'Displacement', 'Horsepower',  and 'Origin'. The project is implemented using Python. Several ML models are implemented in this project to study the relationship between the car’s engine performance metrics and its fuel efficiency. Alternate regression models are also implemented. A customized best subset selection function is also implemented with the aim of improving the results.</p>

## Methods used
<ol>
  <li>
    <strong>Data Collection:</strong> The "Cars" dataset is a well-known dataset used for the study of car features. The dataset is part of the <i>vega_datasets</i> package.
  </li>
  <li>
    <strong>Data Preprocessing:</strong> Dropped duplicate rows followed by one hot encoding for categorical variables. Missing values corresponding to the “miles per gallon” target variable are dropped. After the train-test-split, scaling, and imputation are carried out.
  </li>
  <li>
    <strong>Modeling:</strong> Many Machine Learning models are implemented for the study such as the OLS method of least squares, Random Forest Regressor, Alternative regression model: <u>Quadratic model</u>, OLS is also implemented with best subset selection.
  </li>
  <li>
    <strong>Evaluation:</strong> The models were evaluated using metrics such as Root Mean Square Error, Mean Absolute Error & R-squared.
  </li>
</ol>

## Computational Results

<table border="1" cellpadding="5" cellspacing="0">
  <tr>
    <th>Performance metrics</th>
    <th>OLS method</th>
    <th>Random Forest reg.</th>
    <th>Quadratic model</th>
    <th>OLS with best subset selection</th>
  </tr>
  <tr>
    <td>Root Mean Square Error</td>
    <td>4.288</td>
    <td>3.858</td>
    <td>4.01</td>
    <td>3.989</td>
  </tr>
  <tr>
    <td>Mean Absolute Error</td>
    <td>3.383</td>
    <td>3.049</td>
    <td>3.024</td>
    <td>3.05</td>
  </tr>
  <tr>
    <td>R-squared</td>
    <td>0.751</td>
    <td>0.747</td>
    <td>0.782</td>
    <td>0.771</td>
  </tr>
</table>


## Conclusion
<p>The quadratic model & OLS with best subset selection seem to give better results compared to other models. The quadratic model delivers the highest R-squared value of 0.782 and also has the lowest Mean Absolute Error of 3.024. Displacement and horsepower appear to contribute significantly to the study. The analysis suggests that measures of a car’s performance metrics such as horsepower and displacement are related to the fuel efficiency of a car measured in the miles per gallon. </p>



