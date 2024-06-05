-- Question 1
 SELECT COUNT(*)
FROM Suppliers;
-- 29

-- Question 2
SELECT SUM(Salary)
FROM Employees;

-- Question 3
 SELECT MIN(UnitPrice)
 FROM Products;
 
 -- QUESTION 4
 SELECT AVG(UnitPrice)
FROM Products;

-- Question 5
 SELECT MAX(UnitPrice)
 FROM Products;
 
 -- Question 6
 SELECT SupplierId, QuantityPerUnit
 FROM Products;
 
 -- Question 7
 SELECT CategoryID, AVG(UnitPrice)
 FROM Products
 GROUP BY CategoryID;
 
 -- Question 8
 SELECT SupplierID, COUNT(ProductID) as products_quanity
 FROM Products
 GROUP BY SupplierID
 HAVING count(ProductID) >= 5;
 
 -- Question 9
 SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
 FROM Products
 ORDER BY InventoryValue DESC, ProductName ASC;
 
 
 