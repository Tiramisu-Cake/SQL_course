Поводов для рефлексии не обнаружил.

РЕШЕНИЕ 4.3:
1) SELECT * FROM Customers
WHERE ContactName LIKE '% C%';
2) SELECT * FROM Orders
WHERE Freight BETWEEN 100 and 200 and ShipCountry IN ('France', 'USA');  
3) SELECT * FROM EmployeeTerritories
WHERE TerritoryID BETWEEN 6897 AND 31000;