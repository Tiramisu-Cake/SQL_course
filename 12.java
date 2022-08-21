РЕФЛЕКСИЯ:

11.5.1. Хотя мой и эталонный запросы выдают одинаковые результаты,
эталонный нравится больше ввиду того, что использует меньше полей.

РЕШЕНИЯ 12.3:

12.3.1. Добавьте нового пользователя в таблицу Employees.

INSERT INTO Employees (LastName, FirstName)
VALUES ('Cage', 'Johny');

12.3.2. Свяжите этого нового пользователя с какой-либо территорией с помощью таблицы EmployeeTerritories (многие-ко-многим).

INSERT INTO EmployeeTerritories (EmployeeID, TerritoryID)
VALUES (11, 85014);

12.3.3. Попробуйте добавить новую запись в таблицу заказов Orders. Возникнут ли какие-либо конфликты?

Тривиальный запрос
INSERT INTO Orders (EmployeeID)
VALUES (11);
не привел к конфликтам.
Были автоматически назначены ORDER ID = 11078, Freight = 0, все остальные значения (кроме EmployeeID) приняли значение NULL.

Аналогично, запрос
INSERT INTO Orders (CustomerID)
VALUES ('RANCH');
заполнил NULL все, кроме CustomerID и OrderID, а Freight = 0;

Запрос
INSERT INTO Orders (OrderID)
VALUES (100500);
дает конфликт:
Невозможно вставить явное значение для столбца идентификаторов в таблице "Orders", 
когда параметр IDENTITY_INSERT имеет значение OFF.


