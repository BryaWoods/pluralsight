-- Question 1
INSERT INTO Suppliers(SupplierID, CompanyName, PostalCode)
VALUES (30,"Baked Cleopatra", 15210);

-- Question 2
INSERT INTO Products(ProductID, ProductName, SupplierID, CategoryID)
VALUES(78, "Royal Relaxation Brownies", 30, 3);

-- Question 3
SELECT ProductName, CompanyName
FROM Products
JOIN Suppliers
ON products.SupplierID = Suppliers.SupplierID;


UPDATE Products
SET UnitPrice = 10.82
WHERE SupplierID = 30;



-- Question 4

UPDATE Products
SET UnitPrice = UnitPrice * 1.5
WHERE ProductID = 78;

-- Question 5
SELECT ProductName, UnitPrice
FROM Products
WHERE SupplierID = 30;

-- Question 6
DELETE FROM Products
WHERE ProductID = 78; 

-- Question 7 
DELETE FROM Suppliers
WHERE SupplierID = 30;

-- Question 8 
SELECT ProductName
FROM Products;

-- Question 9
SELECT CompanyName
FROM Suppliers;
 
 