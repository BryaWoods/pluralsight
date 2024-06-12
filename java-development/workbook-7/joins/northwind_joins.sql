-- Question 1 
SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM Products
LEFT JOIN Categories
on Products.CategoryID = Categories.CategoryID
ORDER BY CategoryName, ProductName; 

-- Question 2 
SELECT ProductID, ProductName, UnitPrice, CompanyName
FROM Products
LEFT JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
WHERE UnitPrice > 75
ORDER BY ProductName;
 

-- Question 3 
SELECT ProductID, ProductName, UnitPrice, CategoryName, CompanyName
FROM Products
LEFT JOIN Categories
on Products.CategoryID = Categories.CategoryID
LEFT JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
ORDER BY ProductName;

-- Question 4 
SELECT ProductName, CategoryName
FROM Products
LEFT JOIN Categories
on Products.CategoryID = Categories.CategoryID
WHERE UnitPrice = (SELECT MAX(UnitPrice)
FROM Products);


-- Question 5 
SELECT OrderID, ShipName, ShipAddress, CompanyName
FROM Orders o
LEFT JOIN Shippers s
ON o.ShipVia = s.ShipperID
WHERE ShipCountry LIKE "%Germany%";

-- Question 6
SELECT o.OrderID, OrderDate, ShipName, ShipAddress
FROM Orders o
LEFT JOIN `Order Details` od
ON o.OrderID = od.OrderID
JOIN Products p
ON od.ProductID = p.ProductID
WHERE ProductName LIKE "%Sasquatch Ale%";
 440393541
