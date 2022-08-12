РЕФЛЕКСИЯ:

Надо быть внимательнее и не торопиться!
5.4.1-2: Я просто не увидел в задании необходимость сортировку по стране.
5.4.3: Почему-то решил, что надо задание нужно сделать отдельными командами, что было весьма глупо.

РЕШЕНИЕ 6.3:

1) // Не уверен, что правильно понял задание. Сделал запрос на подсчет количества контактов каждого типа:

SELECT ContactType, COUNT(ContactType) AS TotalNum
FROM Contacts 
GROUP BY ContactType;

// Тот же вариант, но исключим тип контакта NULL:

SELECT ContactType, COUNT(ContactType) AS TotalNum
FROM Contacts
WHERE ContactType IS NOT NULL
GROUP BY ContactType; 

2) SELECT CategoryID, AVG(UnitPrice) as AVG_Price 
FROM Products 
GROUP BY CategoryID
ORDER BY AVG_Price; 