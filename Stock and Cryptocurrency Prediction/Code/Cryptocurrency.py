import requests, pandas as pd, numpy as np, matplotlib.pyplot as plt
from sklearn.preprocessing import MinMaxScaler
from tensorflow.keras.layers import Dense, Dropout, LSTM
from tensorflow.keras.models import Sequential
from keras.models import load_model
import streamlit as st

api_key = '2f0fdd5d49254c06b7dc54cc45a4b628'
interval = '5min'
order = 'asc'
start_date = '2021-10-03 00:00:00'
end_date = '2021-10-20 00:00:00'

st.title('Cryptocurrency Price Prediction and Forecasting')
user_input = st.text_input('Enter Cryptocurrency Ticker','BTC/USD')


api_url = f'https://api.twelvedata.com/time_series?symbol={user_input}&start_date={start_date}&end_date={end_date}&interval={interval}&order={order}&apikey={api_key}'

data = requests.get(api_url).json()
data_final = pd.DataFrame(data['values'])

#describing data
update_df = data_final.describe().drop('top')
st.subheader('Data from 3rd to 20th of 2021')
st.write(update_df.describe())

#RANGE CONVERSION
scaler = MinMaxScaler(feature_range=(0,1))
scaled_data = scaler.fit_transform(data_final['close'].values.reshape(-1,1))

time_intervals_to_train = 24
prediction_interval = 12

x_train = []
y_train = []

#data prepration
for i in range(time_intervals_to_train, len(scaled_data) - prediction_interval):
    x_train.append(scaled_data[i - time_intervals_to_train: i, 0])
    y_train.append(scaled_data[i + prediction_interval, 0])
    
x_train = np.array(x_train)
y_train = np.array(y_train)

x_train = np.reshape(x_train, (x_train.shape[0], x_train.shape[1],1))

#Load crypto model
model = load_model('Crypto_predictor.h5')

test_start = '2021-10-20 00:00:00'
test_end = '2021-10-23 00:00:00'

test_api_url = f'https://api.twelvedata.com/time_series?symbol={user_input}&start_date={test_start}&end_date={test_end}&interval={interval}&order={order}&apikey={api_key}'
test_data = requests.get(test_api_url).json()
test_data_final = pd.DataFrame(test_data['values'])

#test data preparation
bitcoin_prices =pd.to_numeric(test_data_final['close'], errors ='coerce').values
test_inputs = test_data_final['close'].values
test_inputs = test_inputs.reshape(-1,1)
model_inputs = scaler.fit_transform(test_inputs)

x_test= []

for x in range(time_intervals_to_train, len(model_inputs)):
    x_test.append(model_inputs[x - time_intervals_to_train: x, 0])
 
x_test = np.array(x_test)
x_test = np.reshape(x_test, (x_test.shape[0], x_test.shape[1], 1))

prediction_prices = model.predict(x_test)
prediction_prices = scaler.inverse_transform(prediction_prices)

#model acurracy

st.subheader('Model\'s Acurracy')
fig = plt.figure(figsize =(12,4))
plt.plot(bitcoin_prices, label ='Bitcoin Prices')
plt.plot(prediction_prices, label = 'Predicted Prices')
plt.title('Predicting Bitcoin Price')
plt.xlabel('5min Time interval')
plt.ylabel('Price')
plt.legend()
st.pyplot(fig)

#forecast price for the next hour
last_data = model_inputs[len(model_inputs)+1 - time_intervals_to_train: len(model_inputs) +1, 0]
last_data = np.array(last_data)
last_data = np.reshape(last_data, (1, last_data.shape[0], 1))

prediction = model.predict(last_data)
prediction = scaler.inverse_transform(prediction)
st.subheader('Forecasted price for next hour')
st.write("Price: ",prediction[0][0])
