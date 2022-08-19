РЕФЛЕКСИЯ:

9.4.1. Не выполнил условие, что заказчики должны быть разные.

РЕШЕНИЕ 10.4:

10.4.1. Перепишите задание 8.3.2 через синтаксис JOIN.
8.3.2 Организуйте эквисоединение, которое выводит цену и названия тех товаров, 
для которых цена за единицу (UnitPrice) в таблице Order Details меньше 20.

SELECT Products.ProductName, [Order Details].UnitPrice FROM Products
INNER JOIN [Order Details]
ON [Order Details].UnitPrice < 20;

10.4.2. Имеется запрос
SELECT Orders.Freight, Customers.CompanyName
FROM Orders INNER JOIN Customers
ON Orders.CustomerID = Customers.CustomerID
ORDER BY Freight;
Проверьте этот запрос с вариантом FULL JOIN -- 
за счёт чего выдача получилась объёмнее? 
Почему значения NULL встречаются в обоих полях набора?

У меня добавилось ровно две записи.
С помощью запроса

SELECT COUNT(DISTINCT Customers.CompanyName)
FROM Customers INNER JOIN Orders
ON Orders.CustomerID = Customers.CustomerID;

мы узнаем, что среди всех заказов у нас 89 уникальных заказчиков.
При этом всего заказчиков из таблицы Customers - 91.

Таким образом, у нас добавилось два заказчика, которых нет в таблице Orders.
Поскольку им не соответсвует ни одна запись в поле Freight, оно принимает для них
значение NULL с вариантом FULL JOIN.

Записей со значением NULL в поле CompanyName нет, потому что каждая запись поля Freight
нашла свое CompanyName через CustomerID.


10.4.3. Подумайте, как с помощью предложения WHERE превратить запрос CROSS JOIN в INNER JOIN.

Запрос
SELECT Table1.Field1, Table2.Field2 FROM Table1 INNER JOIN Table2 ON (Condition)
равносилен запросу
SELECT Table1.Field1, Table2.Field2 FROM Table1 CROSS JOIN Table2 WHERE (Condition)

10.4.4. Перепишите данный запрос в INNER JOIN:
SELECT Products.ProductName, [Order Details].UnitPrice
FROM Products CROSS JOIN [Order Details]
WHERE Products.ProductID = [Order Details].ProductID

SELECT Products.ProductName, [Order Details].UnitPrice
FROM Products INNER JOIN [Order Details] ON
Products.ProductID = [Order Details].ProductID;
