
## This SQL query retrieves the total quantity of products ordered by each customer by joining information from customer profiles, payments, and order details, providing insights into customer purchasing behavior 
SELECT c.CustomerID, c.CustomerName, SUM(od.ProductQuantity) AS TotalProductQuantityOrdered
FROM Customers AS c
JOIN PaymentProfiles AS pp ON c.CustomerID = pp.CustomerID
JOIN Payment AS p ON pp.PaymentProfileID = p.PaymentProfileID
JOIN OrderDetails AS od ON p.OrderNum = od.OrderNum
GROUP BY c.CustomerID, c.CustomerName;

## This SQL query calculates the average amount spent by all customers with different payment types, offering insights into spending habits across payment methods.
SELECT pp.PaymentType, AVG(p.Amount) AS AvgAmountSpent
FROM Payment AS p
JOIN PaymentProfiles AS pp ON p.PaymentProfileID = pp.PaymentProfileID
GROUP BY pp.PaymentType;


## This SQL query computes the number of deliveries made by each delivery agent on a specific date, along with the count of successful deliveries and their success rates.
SELECT d.DeliveryAgentID, COUNT(*) AS TotalDeliveries, SUM(CASE WHEN d.DeliverySuccess = 1 THEN 1 ELSE 0 END) AS SuccessfulDeliveries,
    AVG(CASE WHEN d.DeliverySuccess = 1 THEN 1 ELSE 0 END) AS SuccessRate
FROM Delivery AS d
WHERE d.DeliveryDate = '2023-08-19'
GROUP BY d.DeliveryAgentID;

## This SQL query identifies the top 10 suppliers based on the maximum quantity of products ordered from each supplier. It assists in supplier performance evaluation and inventory management.
SELECT p.SupplierID, s.SupplierName, p.ProductName, MAX(s.QuantityOrdered) AS QuantityOrdered
FROM Product AS p
JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
GROUP BY p.SupplierID, s.SupplierName, p.ProductName
ORDER BY MAX(s.QuantityOrdered) DESC
LIMIT 10;

## This SQL query calculates the average amount spent per order by customers with specific membership types. It aids in understanding spending behaviors among different membership tiers.
SELECT mt.MembershipName, AVG(p.Amount) AS AvgAmountSpent
FROM Payment AS p
JOIN PaymentProfiles AS pp ON p.PaymentProfileID = pp.PaymentProfileID
JOIN Customers AS c ON pp.CustomerID = c.CustomerID
JOIN MembershipType AS mt ON c.MembershipTypeID = mt.MembershipTypeID
GROUP BY mt.MembershipName;

## This SQL query retrieves the total number of products returned by each customer along with their feedback. It provides valuable insights into customer satisfaction and product quality issues, enabling businesses to address concerns.
SELECT c.CustomerID, c.CustomerName, COUNT(rp.ReturnProductID) AS TotalProductsReturned,
    GROUP_CONCAT(rp.CustomerFeedback) AS CustomerFeedback
FROM Customers AS c
JOIN PaymentProfiles AS pp ON c.CustomerID = pp.CustomerID
JOIN Payment AS p ON pp.PaymentProfileID = p.PaymentProfileID
JOIN OrderDetails AS od ON p.OrderNum = od.OrderNum
JOIN ReturnedProduct AS rp ON od.OrderNum = rp.OrderNum and od.ProductID = rp.ProductID
GROUP BY c.CustomerID, c.CustomerName;

## This SQL query calculates the total number of products returned by customers who have spent more than a certain amount on their orders. It assists in identifying patterns of product dissatisfaction or quality issues among higher-spending customers.
SELECT c.CustomerID, c.CustomerName,
    COUNT(rp.ReturnProductID) AS TotalProductsReturned
FROM Customers AS c
JOIN PaymentProfiles AS pp ON c.CustomerID = pp.CustomerID
JOIN Payment AS p ON pp.PaymentProfileID = p.PaymentProfileID
JOIN OrderDetails AS od ON p.OrderNum = od.OrderNum
JOIN ReturnedProduct AS rp ON od.OrderNum = rp.OrderNum
WHERE p.Amount > 100
GROUP BY c.CustomerID, c.CustomerName;

## This SQL query retrieves a list of all customers who have purchased more than 5 products, regardless of whether all their orders are recorded. By joining order details, payments, payment profiles, and customer information, it provides insights into high-volume purchasers.
SELECT c.CustomerID, c.CustomerName, COALESCE(COUNT(od.OrderNum), 0) AS TotalOrders
FROM OrderDetails AS od
RIGHT JOIN Payment AS p ON od.OrderNum = p.OrderNum
JOIN PaymentProfiles AS pp ON p.PaymentProfileID = pp.PaymentProfileID
RIGHT JOIN Customers AS c ON pp.CustomerID = c.CustomerID
GROUP BY c.CustomerID, c.CustomerName
HAVING TotalOrders > 5;


## This SQL query calculates the number of total orders and the number of orders that are being delivered. By utilizing a LEFT OUTER JOIN between the Payment and Delivery tables on the OrderNum field, it ensures that all orders are counted, regardless of whether they have corresponding delivery records. This provides insights into order fulfillment and delivery efficiency.
SELECT COUNT(p.OrderNum) AS NumberOfOrders,
    COUNT(d.OrderNum) AS NumberOfDeliveries
FROM Payment AS p
LEFT OUTER JOIN 
Delivery AS d ON p.OrderNum = d.OrderNum;

## This SQL query retrieves the top 10 categorical months with the highest amount of sales, formatted with the financial year. By grouping payment data by month, summing up the sales amounts, and ordering the results in descending order, it provides insights into sales performance over time, facilitating strategic decision-making.
SELECT DATE_FORMAT(PaymentDateTime, '%Y-%m') AS PaymentMonth,
    SUM(Amount) AS TotalSales
FROM Payment
GROUP BY DATE_FORMAT(PaymentDateTime, '%Y-%m')
ORDER BY TotalSales DESC
LIMIT 10;

##  This SQL query calculates the total number of orders placed by customers who have a membership type with a validity period of more than 2 year. It achieves this by filtering orders based on membership types with a validity period greater than 2 year, using nested subqueries to retrieve relevant data from the Customers, PaymentProfiles, Payment, and MembershipType tables.
SELECT m.MembershipName, COUNT(*) AS TotalOrders
FROM OrderDetails AS od
JOIN Payment AS p ON od.OrderNum = p.OrderNum
JOIN PaymentProfiles AS pp ON p.PaymentProfileID = pp.PaymentProfileID
JOIN Customers AS c ON pp.CustomerID = c.CustomerID
JOIN MembershipType AS m ON c.MembershipTypeID = m.MembershipTypeID
WHERE c.MembershipTypeID IN (
        SELECT MembershipTypeID
        FROM MembershipType
        WHERE ValidityPeriod > 2
    )
GROUP BY m.MembershipName;



### Stored Proc

### This procedure calculates the total number of orders placed by a customer for a given category.
CALL QuantityByCustNCatID(888, 1003);


### Takes a customer ID as input and returns the following information:
### Total number of orders placed by the customer (Total_orders).
### Total amount spent by the customer (Total_amount).
### Average amount spent per order by the customer (Average_amount).

CALL GetCustomerPurchaseHistory(888, @Total_orders, @Total_amount, @Average_amount);
SELECT @Total_orders, @Total_amount, @Average_amount;


























