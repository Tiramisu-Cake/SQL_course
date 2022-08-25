15.7. Задание
Создайте в новой базе таблицу Territories со структурой, 
аналогичной структуре таблицы Territories из учебной базы. 
Добавьте в неё и таблицу Region несколько значений так, 
чтобы они оказались связаны друг с другом через FK.

CREATE DATABASE MyTest;

USE MyTest;

CREATE TABLE Region (
RegionID int NOT NULL, RegionDescription nchar(50) NOT NULL);

INSERT INTO Region
VALUES (1, 'USA'), (2, 'Europe'), (3, 'Africa'), (4, 'Middle East');

CREATE TABLE Territories (
TerritoryID int NOT NULL, TerritoryDescription nchar(50) NOT NULL, RegionID int NOT NULL);

INSERT INTO Territories
VALUES (100, 'California', 1), (101, 'Texas', 1), (200, 'Germany', 2), (201, 'France', 2),
(300, 'Egypt', 3), (301, 'Morocco', 3), (400, 'UAE', 4), (401, 'Oman', 4);

Проверка связи:
SELECT Territories.TerritoryDescription, Region.RegionDescription FROM Territories, Region
WHERE Territories.RegionID = Region.RegionID;
