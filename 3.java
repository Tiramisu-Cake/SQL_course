РЕФЛЕКСИЯ:

Не совсем согласен со строкой:
Employees	многие ко многим(через EmployeeTerritories)	Territories
В таблице EmployeeTerritories в поле TerritoryID каждая запись уникальна, а в поле EmployeeID - нет.
Значит, один сотрудник соответсвует нескольким территориям, но каждой территории соответствует ровно один сотрудник.
Поэтому отношение Employees - Territories - один-ко-многим.
Или нам важен сам факт того, что связь осуществляется через три таблицы, и на основании этого мы говорим многие-ко-многим?
Подумаю над этим.

В следующей строке допустил я допустил ошибку:
Orders	        многие ко многим(через OrderDetails)	        Products
Таблица OrderDetails связывает таблицы Orders и Products, аналогично случаю выше.
Понятно, что в одном заказе может быть много продуктов, а один продукт быть в нескольких заказах
Поэтому выписывать отдельные связи
4) Заказы - Детали заказов: один-ко-многим
5) Детали заказов - Продукция: многие-ко-многим
неправильно.

Не понятно, почему в эталонном решении отсутствуют связи по таблице Contacts.
Да, не каждая запись таблицы Contacts соответсвует записи, например, в Employee.
Видимо, мы считаем связью только если каждой записи таблицы A соответсвует хотя бы одна запись таблицы B?
И если хоть одна запись в таблице B не имеет связи с А, то A и B не связаны?
Подумаю над этим.


РЕШЕНИЕ 3.9:

1) SELECT ProductName, UnitsInStock FROM Products;
2) SELECT ProductName, UnitPrice FROM Products
WHERE (UnitPrice < 20);
3) SELECT * FROM Orders 
WHERE (Freight >= 11.7) AND (Freight <= 98.1);
4) SELECT * FROM Employees
WHERE (TitleOfCourtesy = 'Mr.') OR (TitleOfCourtesy = 'Dr.'); // На данный момент докторов-женщин в штате нет, поэтому запрос корректен
5) SELECT * FROM Orders
WHERE (EmployeeID = 2) OR (EmployeeID = 4) OR (EmployeeID = 8);
6) SELECT OrderID, ProductID FROM [Order Details]
WHERE (UnitPrice > 40) AND (Quantity < 10);

