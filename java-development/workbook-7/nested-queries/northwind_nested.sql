-- Question 1
SELECT ProductName
FROM Products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
FROM Products);


-- Question 2 
SELECT OrderID, ShipName, ShipAddress
FROM Orders
WHERE ShipVia = (SELECT ShipperID
FROM Shippers
WHERE CompanyName LIKE "%Federal Shipping%");


-- Question 3 
SELECT OrderID
FROM `Order Details`
WHERE ProductID = (SELECT ProductID
FROM Products
WHERE ProductName LIKE "%Sasquatch Ale%"); 

-- Question 4 
SELECT FirstName, LastName
FROM Employees
WHERE EmployeeID = (SELECT EmployeeID
FROM  Orders
WHERE OrderID = 10266);

-- Question 5 
SELECT ContactName
FROM Customers
WHERE CustomerID = (SELECT CustomerID
FROM  Orders
WHERE OrderID = 10266);

