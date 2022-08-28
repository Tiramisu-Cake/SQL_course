Задание. Добавьте подходящие индексы для таблиц тестовой базы, созданной в предыдущем занятии.

CREATE CLUSTERED INDEX idxRegionID ON Region (RegionID);

CREATE CLUSTERED INDEX idxTerritoryID ON Territories (TerritoryID);

CREATE INDEX TerritoryDescription ON Territories (TerritoryDescription);
