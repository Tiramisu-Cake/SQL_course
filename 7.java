РЕШЕНИЕ 7.3:

1) // Сначала я подумал, что поле Discount надо просто умножить на 100:

SELECT Discount * 100 AS DiscountPercantage FROM [Order Details];

// А потом заметил, что UnitPrice.[Order Details] отличается от UnitPrice.Products даже по тем ProductID, у которых Discount = 0;
// Поэтому нужно UnitPrice в Order Details сравнить с UnitPrice в Products и посчитать разницу в процентах:

SELECT (1 - [Order Details].UnitPrice / Products.UnitPrice) * 100 FROM [Order Details], Products
WHERE [Order Details].ProductID = Products.ProductID;

// Мне кажется, этот запрос пока выходить за рамки наших знаний, но другого пути не нашел.

2) SELECT * FROM [Order Details]
WHERE ProductID IN
(SELECT ProductID FROM Products
WHERE UnitsInStock > 40);

3) SELECT * FROM [Order Details]
WHERE ProductID IN
(SELECT ProductID FROM Products
WHERE UnitsInStock > 40)
AND OrderID IN
(SELECT OrderID FROM Orders
WHERE Freight >= 50);
