РЕФЛЕКСИЯ:

10.4.1 Очень стыдно, что все мои ошибки именно в простых заданиях.
Я добавил условие фильтрации (цена за единицу меньше 20), но не добавил, собственно, условие пересечения таблиц.
НАДО БЫТЬ ВНИМАТЕЛЬНЕЕ!!

РЕШЕНИЕ 11.5:

11.5.1. Отберите с помощью LEFT JOIN все записи из таблицы Customers, для которых FK-ключ таблицы Orders пустой.

SELECT * FROM Customers 
LEFT JOIN Orders
ON Orders.CustomerID = Customers.CustomerID
WHERE OrderID IS NULL;


11.5.2. Выведите конкретную информацию по всем пользователям Customers и поставщикам Suppliers -- 
имя контактной персоны, город и страну, а также идентификацию группы (пользователь или поставщик).

SELECT 'Customer' As Type, ContactName, City, Country FROM Customers 
UNION 
SELECT 'Supplier' As Type, ContactName, City, Country FROM Suppliers;