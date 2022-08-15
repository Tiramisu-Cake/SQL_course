РЕФЛЕКСИЯ:

7.3.1. Не вывел поля OrderID и ProductID, руководствуясь фразой "Выведите вычислимое поле...".
Т.е. я вывел именно вычислимое поле и только его.

РЕШЕНИЕ 8.3:

1) SELECT Products.ProductName, Categories.CategoryName FROM Products, Categories
WHERE Products.CategoryID = Categories.CategoryID;

2) SELECT Products.ProductName, [Order Details].UnitPrice FROM Products, [Order Details]
WHERE Products.ProductID = [Order Details].ProductID AND [Order Details].UnitPrice < 20;

3) SELECT Categories.CategoryName, Products.ProductName, [Order Details].UnitPrice 
FROM Categories, Products, [Order Details]
WHERE Categories.CategoryID = Products.CategoryID AND Products.ProductID = [Order Details].ProductID
AND [Order Details].UnitPrice < 20;