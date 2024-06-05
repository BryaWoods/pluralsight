-- Question 1
	-- Products
-- Question 2
SELECT productID, ProductName, UnitPrice
FROM Products;

-- Question 3
SELECT *
FROM Products
ORDER BY UnitPrice ASC;

-- Question 4
SELECT *
FROM Products
WHERE UnitPrice <= 7.5;

-- Question 5 
SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;

-- Question 7
SELECT *
FROM Products
WHERE UnitsInStock <= 0 AND UnitsOnOrder >=1
ORDER BY ProductName;

-- Question 8 
	-- Categories 
    
-- Question 9
SELECT *
FROM Categories;
	-- Seafood ID is 8
    
-- Question 10 
SELECT *
FROM Products
WHERE CategoryID = 8;

-- Question 11
  SELECT FirstName, LastName
  FROM Employees;
  
-- Question 12
SELECT *
FROM Employees
WHERE Title LIKE '%manager%';

-- Question 13
SELECT DISTINCT Title
FROM Employees;

-- Question 14
SELECT *
FROM Employees
WHERE Salary BETWEEN 2000 and 2500;

-- Question 15
SELECT *
FROM Suppliers;

-- Question 16
SELECT *
FROM Suppliers
WHERE SupplierID = 4;

  

