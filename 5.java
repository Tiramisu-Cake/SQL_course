РЕФЛЕКСИЯ:
4.3.1. Не понятно, почему первый вариант вообще считается корректным.
В поле ContactName первым идет именно имя, а не фамилия, поэтому
он выведет все контакты, у которых имя начинается на C.
Поэтому второй вариант является единтсвенно верным.

РЕШЕНИЕ 5.4:
1) SELECT * FROM Employees ORDER BY BirthDate DESC;

2) SELECT * FROM Employees
WHERE Region IS NOT NULL
ORDER BY BirthDate DESC;

3) Средняя:
SELECT AVG(UnitPrice) FROM [Order Details]; // 26,2185
Максимальная: 
SELECT MAX(UnitPrice) FROM [Order Details]; // 263,50
Минимальная:
SELECT MIN(UnitPrice) FROM [Order Details]; // 2,00

4) SELECT COUNT(DISTINCT City) FROM Customers;
