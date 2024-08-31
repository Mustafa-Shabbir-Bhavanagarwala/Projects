
import webbrowser
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import pandas_datareader as data
from keras.models import load_model
import streamlit as st
import tensorflow as tf
import math 
from streamlit_option_menu import option_menu
from datetime import date, datetime, timedelta


def crypto():
    import requests, pandas as pd, numpy as np, matplotlib.pyplot as plt
    from sklearn.preprocessing import MinMaxScaler
    from tensorflow.keras.layers import Dense, Dropout, LSTM
    from tensorflow.keras.models import Sequential
    from keras.models import load_model
    import streamlit as st

    api_key = '2f0fdd5d49254c06b7dc54cc45a4b628'
    interval = '5min'
    order = 'asc'
    start_date =  datetime.strftime(datetime.now() - timedelta(20),'%Y-%m-%d %H:%M:%S')
    end_date = datetime.strftime(datetime.now() - timedelta(3),'%Y-%m-%d %H:%M:%S')

    st.title('Cryptocurrency Price Prediction and Forecasting')
    user_input = st.text_input('Enter Cryptocurrency Ticker','BTC/USD')
    if len(user_input)==0:
        st.warning("Enter cryptocurrency symbol")
        return
    try:
        api_url = f'https://api.twelvedata.com/time_series?symbol={user_input}&start_date={start_date}&end_date={end_date}&interval={interval}&order={order}&apikey={api_key}'
        data = requests.get(api_url).json()
        data_final = pd.DataFrame(data['values'])

    except:
        st.warning("Invalid Cryptocurrency Symbol")
        return
    if len(data_final.index)<21:
        st.warning("OOPS! Insufficient data to predict,Cryptocurrency should be minimun 21 days old")
        return
   
    
    
#describing data
    #update_df = data_final.describe().drop('top')
    #st.subheader('Data from 3rd to 20th of 2021')
    #st.write(update_df.describe())

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
    model = load_model('Cryptoc_predictor.h5')

    test_start =datetime.strftime(datetime.now() - timedelta(3),'%Y-%m-%d %H:%M:%S')
    now= datetime.now()
    test_end = now.strftime("%Y-%m-%d %H:%M:%S")

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
    plt.plot(bitcoin_prices, label ='Actual Prices')
    plt.plot(prediction_prices, label = 'Predicted Prices')
    plt.xlabel('5min Time interval')
    plt.ylabel('Price')
    plt.legend()
    st.pyplot(fig)

#forecast price for the next hour
    last_data = model_inputs[len(model_inputs) - time_intervals_to_train: len(model_inputs), 0]
    last_data = np.array(last_data)
    last_data = np.reshape(last_data, (1, last_data.shape[0], 1))

    prediction = model.predict(last_data)
    prediction = scaler.inverse_transform(prediction)
    st.subheader('Forecasted price for next hour')
    st.write("Price: ",prediction[0][0])


def stocks():
    start= datetime.strftime(datetime.now() - timedelta(3650),'%Y-%m-%d %H:%M:%S')
    today= date.today()
    end= today.strftime("%Y-%m-%d")

    user_input= st.text_input('Enter Stock Ticker','AAPL')
    if len(user_input)==0:
        st.warning("Enter stock symbol")
        return
    finance= 'yahoo'
    try:
        df=data.DataReader(user_input,finance,start,end)
    except:
        st.warning("Invalid Stock Name")
        return
    if len(df.index)<365:
        st.warning("OOPS! Insufficient data to predict,Stock should be minimun 1 year old")
        return

#describing data
    st.subheader('Data Statistics Available')
    st.write(df.describe())

#visulisations
    st.subheader('Closing Price vs Time chart')
    fig = plt.figure(figsize =(12,4))
    plt.plot(df.Close)
    plt.xlabel('Time (years)')
    plt.ylabel('Closing price')
    st.pyplot(fig)

    st.subheader('Closing Price vs Time chart with 100MA')
    ma100 = df.Close.rolling(100).mean()
    fig = plt.figure(figsize =(12,4))
    plt.plot(ma100)
    plt.plot(df.Close)
    plt.xlabel('Time (years)')
    plt.ylabel('Closing price')
    st.pyplot(fig)

    st.subheader('Closing Price vs Time chart with 100MA & 200MA')
    ma100 = df.Close.rolling(100).mean()
    ma200 = df.Close.rolling(200).mean()
    fig = plt.figure(figsize =(12,4))
    plt.plot(ma100)
    plt.plot(ma200)
    plt.plot(df.Close)
    plt.xlabel('Time (years)')
    plt.ylabel('Closing price')
    st.pyplot(fig)
# end of streamlit_L

    df1=df.reset_index()['Close']
#minmaxscaler range
    from sklearn.preprocessing import MinMaxScaler
    scaler=MinMaxScaler(feature_range=(0,1))
    df1=scaler.fit_transform(np.array(df1).reshape(-1,1))
    training_size=int(len(df1)*0.65)

#splitting dataset into train and test split
    test_size=len(df1)-training_size
    train_data,test_data=df1[0:training_size,:],df1[training_size:len(df1),:1]

# convert an array of values into a dataset matrix
# convert an array of values into a dataset matrix
    def create_dataset(dataset, time_step=1):
	    dataX, dataY = [], []
	    for i in range(len(dataset)-time_step-1):
		    a = dataset[i:(i+time_step), 0]   ###i=0, 0,1,2,3-----99   100 
		    dataX.append(a)
		    dataY.append(dataset[i + time_step, 0])
	    return np.array(dataX), np.array(dataY)

# reshape into X=t,t+1,t+2,t+3 and Y=t+4
    time_step = 100
    X_train, y_train = create_dataset(train_data, time_step)
    X_test, ytest = create_dataset(test_data, time_step)

#Load stock model
    model = load_model('Stockp_predictor.h5')

### Lets Do the prediction and check performance metrics
    train_predict=model.predict(X_train)
    test_predict=model.predict(X_test)

##Transform back to original form
    train_predict=scaler.inverse_transform(train_predict)
    test_predict=scaler.inverse_transform(test_predict)

### Calculate RMSE performance metrics
    import math
    from sklearn.metrics import mean_squared_error
    math.sqrt(mean_squared_error(y_train,train_predict))

### Test Data RMSE
    math.sqrt(mean_squared_error(ytest,test_predict))

### Plotting 
# shift train predictions for plotting
    look_back=100
    trainPredictPlot = np.empty_like(df1)
    trainPredictPlot[:, :] = np.nan
    trainPredictPlot[look_back:len(train_predict)+look_back, :] = train_predict
# shift test predictions for plotting
    testPredictPlot = np.empty_like(df1)
    testPredictPlot[:, :] = np.nan
    testPredictPlot[len(train_predict)+(look_back*2)+1:len(df1)-1, :] = test_predict
# plot baseline and predictions
    st.subheader('Model\'s Acurracy')
    fig = plt.figure(figsize =(12,4))
    plt.plot(scaler.inverse_transform(df1))
    plt.plot(trainPredictPlot)
    plt.plot(testPredictPlot)
    plt.xlabel('Days')
    plt.ylabel('Closing price')
    st.pyplot(fig)

    x_input=test_data[len(test_data)-100:].reshape(1,-1)
    temp_input=list(x_input)
    temp_input=temp_input[0].tolist()

# demonstrate prediction for next 30 days
    from numpy import array

    lst_output=[]
    n_steps=100
    i=0
    while(i<30):
    
        if(len(temp_input)>100):
        #print(temp_input)
            x_input=np.array(temp_input[1:])
            print("{} day input {}".format(i,x_input))
            x_input=x_input.reshape(1,-1)
            x_input = x_input.reshape((1, n_steps, 1))
        #print(x_input)
            yhat = model.predict(x_input, verbose=0)
            print("{} day output {}".format(i,yhat))
            temp_input.extend(yhat[0].tolist())
            temp_input=temp_input[1:]
        #print(temp_input)
            lst_output.extend(yhat.tolist())
            i=i+1
        else:
            x_input = x_input.reshape((1, n_steps,1))
            yhat = model.predict(x_input, verbose=0)
            print(yhat[0])
            temp_input.extend(yhat[0].tolist())
            print(len(temp_input))
            lst_output.extend(yhat.tolist())
            i=i+1

    day_new=np.arange(1,101)
    day_pred=np.arange(101,131)

    st.subheader('Prediction for next 30 days')
    fig = plt.figure(figsize =(12,4))
    plt.plot(day_new,scaler.inverse_transform(df1[len(df1)-100:]))
    plt.plot(day_pred,scaler.inverse_transform(lst_output))
    plt.xlabel('Days')
    plt.ylabel('Closing price')
    st.pyplot(fig)

    st.subheader('Forecasted Stock prices')
    fig = plt.figure(figsize =(12,4))
    df3=df1.tolist()
    df3.extend(lst_output)
    df3=scaler.inverse_transform(df3).tolist()
    plt.plot(df3)
    plt.xlabel('Days')
    plt.ylabel('Closing price')
    st.pyplot(fig)

#navigation bar
selected = option_menu(
    menu_title=None,
    options= ["Stock", "Cryptocurrency"],
    icons=["Stock","Cryptocurrency"],
    menu_icon="cast",
    default_index= 0,
    orientation = "horizontal",
)

if selected =="Stock":
    st.title('Stock Price Prediction and Forecasting')
    stocks()
if selected =="Cryptocurrency":
    crypto()





 

