<h1 align="center">Weather Insights: Analysis & Predictive Modeling for Rain</h1>

<p align="right"><b>By: Mustafa Shabbir Bhavanagarwala</b></p>

## Abstract
<p>In this project, rainfall for the next day is predicted with a focus on achieving the best accuracy using Machine Learning. Historical weather data which include factors like temperature, evaporation, sunshine, and pressure is used to build the model for the predictions. XGB Classifier is the machine learning model decided upon for solving the problem. The predictions aim to provide reliable forecasts to assist in agricultural planning and weather-related decision-making.</p>

## Introduction
<p>This study focuses on machine learning techniques to predict if it will rain tomorrow based on a number of factors like temperature, wind, humidity, and temperature at different times of day. The project uses the rain dataset, which contains significant features about the weather like Max Temp, Wind Gust Speed, and measures of these factors at different times of the day.</p>

## Methodology
<ol>
<li>Data Collection: The dataset contains daily weather observations from several years, for various parameters. The target variable is binary, indicating whether it will rain the following day.</li>
<li>
Data Preprocessing: Out-of-range values and duplicate rows were removed from the dataset. Dummy variables were created followed by renaming of features. Dropped any rows that are missing the dependent variable rain_tomorrow. After the train-test-split, scaling, and imputation were carried out.</li>
<li>
Modeling: The machine learning algorithm implemented for the prediction is XGB Classifier. The parameters focused on hyperparameter tuning are Column Sample by Tree, Minimum Loss Reduction, Learning Rate, Maximum Depth of Trees, Number of Trees, & Subsample Ratio. The model is then updated with the best hyperparameters found by Randomized Search CV and trained.</li>
<li>
Evaluation: The models were evaluated using metrics such as Accuracy, Precision, Recall & F1 score.</li>
</ol>

## Computational Results
<ol>
<li>Accuracy</li>
<p>
After the evaluation of the test results, an accuracy of 85% is achieved. The model appears to predict well on the test set.</p>
<li>
Precision</li>
<p>No rain: 0.87 — Out of all the instances predicted as "no rain", 87% were correct.<br>
Yes rain: 0.74 — Out of all the instances predicted as "yes rain", 74% were correct.</p>
<li>
Recall</li>
<p>
No rain: 0.94 — The model correctly identified 94% of the actual "no rain" instances.<br>
Yes rain: 0.56 — The model correctly identified 56% of the actual "yes rain" instances.</p>
<li>F1-Score</li>
<p>No rain: 0.91 — The F1-score for "no rain" is high, indicating a good balance between precision and recall.<br>
Yes rain: 0.64 — The F1-score for "yes rain" is lower, indicating that the model struggles more with accurately identifying rainfall.</p>
</ol>

## Conclusion
<p>In this project, the XGB Classifier was well able to predict rainfall for the next day with an accuracy of 85%. The most important features that came out to be are Pressure, Humidity, and Sunshine. Future work could explore the use of more advanced techniques, such as deep learning to further enhance predictive accuracy. Moreover, incorporating additional features such as Vorticity, Weather Fronts, and advanced weather metrics could improve the model's performance.</p>
 

