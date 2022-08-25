РЕФЛЕКСИЯ:

13.3.1
UPDATE [OrderDetails]
SET Discount = 0.20
WHERE ProductID IN
  (SELECT ProductID IN Products
   WHERE UnitsInStock > 50)

Руки чесались сообщить, что поле Quantity отвечает не за остаток на складе, а за количество заказанного товара.
Но я решил не спорить. :) 

РЕШЕНИЯ 14:

14.1. Чем представление Invoices отличается от таблицы Orders?

Дополнительно к информации из Orders, представление Invoices выдает подсчет итоговой цены 
(количество товара умножается на его цену) с учетом скидки и доставки, формула указана в запросе. 
Так же указывается информация о заказчике 
(из таблицы Customers - название компании и полный адрес с регионом, страной, индексом и т.д. ) 
и о перевозчике (из таблицы Shippers).

14.2. Что делает представление "CategorySales for 1997"?

Сначала идет обращение к представлению Product Sales for 1997.
В этом представлении суммируется сумма (в денежном эквиваленте) всех проданных товаров с учетом скидки за период 01.01-31.12.1997.
Причем представление идет по каждому товару - ID его категории, название товара и вышеуказанная сумма по этому товару.

Представление CategorySales for 1997 суммирует суммы из представления Product Sales for 1997, категории которых совпадают,
и выдает результат по каждой категории.

14.3. Что делает представление "Sales Total by Amount"?

Сначала идет обращение к представлению Order Subtotals, которое дает итоговую стоимость всех товаров по каждому заказу
(с учетом скидки, но без учета доставки).
Sales Total by Amount добавляет к этой информации название компании-заказчика, дату отгрузки, и выдает только те заказы,
в которых сумма заказа из Order Subtotals больше 2500, и которые отгружены в 1997г.

14.4. Что делает представление "Products Above Average Price"?

Берет все товары из Products, вычисляет их среднюю цену и выдает те товары (название и цену), 
цены которых выше этой средней.

14.5. Что делает представление "Summary of Sales by Quarter"?

Смотрит все отгруженные заказы (т.е. те, у которых ShippedDate не NULL), и выдает информацию по ним,
дата отгрузки, ID заказа, сумма заказа из Order Subtotals.