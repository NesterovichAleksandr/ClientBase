CREATE DATABASE ClientBase;

DROP TABLE IF EXISTS honey;
CREATE TABLE honey
(
    id             bigint PRIMARY KEY,
    prise          money,
    datePumpingOut DATE
);
DROP TABLE IF EXISTS customer;
CREATE TABLE customer
(
    id    bigint PRIMARY KEY,
    name  CHARACTER VARYING(30),
    phone bigint
);