insert into customer (id, name, phone)
values (1, 'Петя', 375291112233);
insert into customer (id, name, phone)
values (2, 'Вася', 375294445566);
insert into customer (id, name, phone)
values (3, 'Коля', 375297778899);
insert into customer (id, name, phone)
values (4, 'Ваня', 375336667788);

insert into orders (id, amount, "date", customer_id)
values (1, 20, '20.06.2023', 1);
insert into orders (id, amount, "date", customer_id)
values (2, 50, '20.06.2023', 2);
insert into orders (id, amount, "date", customer_id)
values (3, 40, '20.06.2023', 3);
insert into orders (id, amount, "date", customer_id)
values (4, 60, '20.06.2023', 4);

insert into customer_orders (customer_id, orders_id)
values (1, 1);
insert into customer_orders (customer_id, orders_id)
values (2, 2);
insert into customer_orders (customer_id, orders_id)
values (3, 3);
insert into customer_orders (customer_id, orders_id)
values (4, 4);


insert into product (id, "date", name, price, order_id)
values (1, '14.06.2023', 'мёд', 20, 3);
insert into product (id, "date", name, price, order_id)
values (2, '10.07.2023', 'мёд', 20, 2);
insert into product (id, "date", name, price, order_id)
values (3, '07.08.2023', 'мёд', 20, 4);
insert into product (id, "date", name, price, order_id)
values (4, '12.10.2023', 'соты', 50, 1);
insert into product (id, "date", name, price, order_id)
values (5, '30.09.2023', 'соты', 50, 1);
insert into product (id, "date", name, price, order_id)
values (6, '23.08.2023', 'мёд', 18, 3);

insert into orders_products (order_id, products_id)
values (1, 1);
insert into orders_products (order_id, products_id)
values (2, 2);
insert into orders_products (order_id, products_id)
values (3, 3);
insert into orders_products (order_id, products_id)
values (4, 4);
insert into orders_products (order_id, products_id)
values (1, 5);

