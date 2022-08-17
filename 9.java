РЕШЕНИЕ 9.4:

9.4.1. Найдите все пары из разных заказчиков (Customers), 
для которых не задан регион (поле Region).

SELECT t1.ContactName, t2.ContactName, t2.Region
FROM Customers t1, Customers t2
WHERE t1.Region IS NULL AND t2.Region IS NULL;

9.4.2. Найдите вложенным запросом список заказов (Orders), 
в котором у заказчиков (Customers) регион не пуст (поле Region). 

SELECT * FROM Orders
WHERE CustomerID = ANY
(SELECT CustomerID FROM Customers WHERE Region IS NOT NULL);

9.4.3. Немного условный, но показательный пример. 
Найдите все заказы (таблица Orders), цена за доставку товара которых (Freight) 
превышает цену любого товара (поле UnitPrice, таблица Products).

// Вообще любого товара (a)? Или любого товара, входящих в заказ (b)?

(a) SELECT * FROM Orders
WHERE Freight > ALL
(SELECT UnitPrice FROM Products);

(b) SELECT * FROM Orders
WHERE Freight > ALL
(SELECT UnitPrice FROM Products
WHERE ProductID = ANY
(SELECT ProductID FROM [Order Details]
WHERE Orders.OrderID = [Order Details].OrderID));