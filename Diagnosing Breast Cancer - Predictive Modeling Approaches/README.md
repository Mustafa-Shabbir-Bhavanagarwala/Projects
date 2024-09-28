<h1 align="center">Diagnosing Breast Cancer: Predictive Modeling Approaches</h1>

<p align="right"><b>By: Mustafa Shabbir Bhavanagarwala</b></p>

## Overview
<p>This project is based on the study of the breast cancer data. Here the focus is to identify whether the class of tumor is benign or malignant. Several models are implemented to gain better results. The dataset consists of thirty features with each being one of the geometric, textural, or Statistical descriptors.</p>

## Introduction
<p>The breast cancer data used in this project consists of about 569 entries. Each entry in this data frame represents a single breast cancer tumor sample. The columns contain various features that describe the physical characteristics of the tumor, derived from digitized images of fine needle aspirates (FNA) of breast masses. Through in-depth analysis few significant features like the worst texture and worst radius of the tumor are identified and focused on in some ML models.</p>

## Approach

<p>This data preprocessing in this project involves checking and removal of the duplicate rows followed by cleaning the column names. Later the data is split into train and test sets. Next the numerical predictor variables in the training and testing sets are scaled to have a mean of 0 and a standard deviation of 1. The two models decided for implementation are logistic regression and XG Boost. An XGB Classifier model is initialized, and a Randomized Search CV is used to find the best hyperparameters, with a random sampling of parameters like learning_rate, max_depth, and subsample. The search is performed using 5-fold cross-validation. Once the best parameters are found, the model is trained on the training data. The metrics used for evaluation are Accuracy, Precision, Recall & F1 score.</p>

## Results:
<ul>
<li>XGB Classifier</li>
<div style="background-color: transparent;">
  <p>- Accuracy<br>
    &nbsp;&nbsp;An accuracy of 96% is achieved on the test set, indicating a great performance.</p>

  <p>- Precision<br>
    &nbsp;&nbsp;Benign (0.94): Out of all the instances predicted as benign, 94% were correct.<br>
    &nbsp;&nbsp;Malignant (1.00): Out of all the instances predicted as malignant, 100% were correct.</p>

  <p>- Recall<br>
    &nbsp;&nbsp;Benign (1.00): The model correctly identified 100% of the actual benign instances.<br>
    &nbsp;&nbsp;Malignant (0.88): The model correctly identified 88% of the actual malignant instances.</p>

  <p>- F1-Score<br>
    &nbsp;&nbsp;Benign (0.97): The F1-score for benign is high, showing good recall and precision.<br>
    &nbsp;&nbsp;Malignant (0.94): The F1-score for malignant is also high, but slightly lower due to lower recall compared to benign cases.</p>
</div>

<li>Logistic Regression Model</li>
<p>&nbsp;Accuracy: 87%</p>

<table border="1" cellspacing="0" cellpadding="5" style="border-collapse: collapse; width: auto; border-color: black; text-align: center;">
  <tr>
    <th></th>
    <th>Precision</th>
    <th>Recall</th>
    <th>f1-score</th>
  </tr>
  <tr>
    <td>benign</td>
    <td>0.91</td>
    <td>0.93</td>
    <td>0.92</td>
  </tr>
  <tr>
    <td>malignant</td>
    <td>0.88</td>
    <td>0.83</td>
    <td>0.85</td>
  </tr>
</table>

<li>XGB Classifier</li>
<p>&nbsp;Accuracy: 96%</p>

<table border="1" cellspacing="0" cellpadding="5" style="border-collapse: collapse; width: auto; border-color: black; text-align: center;">
  <tr>
    <th></th>
    <th>Precision</th>
    <th>Recall</th>
    <th>f1-score</th>
  </tr>
  <tr>
    <td>benign</td>
    <td>0.94</td>
    <td>1.00</td>
    <td>0.97</td>
  </tr>
  <tr>
    <td>malignant</td>
    <td>1.00</td>
    <td>0.88</td>
    <td>0.94</td>
  </tr>
</table>




## Conclusion
<p>XGB Classifier seems to perform the better than logistic regression model with a well-achieved accuracy of 96%. The texture, area, and concavity prove to be important features for the prediction. The project provides an efficient, accurate, and scalable solution that can assist in the early diagnosis of breast cancer, ultimately improving patient outcomes and reducing the burden on healthcare systems.</p>
