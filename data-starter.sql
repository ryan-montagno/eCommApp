DROP DATABASE IF EXISTS `ecomm_app`;
CREATE DATABASE `ecomm_app`;
USE `ecomm_app`;
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
    `product_id` bigint NOT NULL AUTO_INCREMENT,
    `product_name` varchar(255) DEFAULT NULL,
    `product_desc` varchar(255) DEFAULT NULL,
    `product_price` decimal(19, 2) DEFAULT NULL,
    `product_tag` varchar(255),
    `image_url` varchar(255),
    PRIMARY KEY (`product_id`)
);
INSERT INTO `ecomm_app`.products 
VALUES (1, 'Apple', 'A red fruit.', 1.76, 'food', '/product-images/apple.jpg'),
    (2, 'Baseball', 'A ball for baseball', 5.97, 'sports', '/product-images/tshirt.jpg'),
    (3, 'T-Shirt', 'A piece of clothing', 10.35, 'clothing', '/product-images/baseball.jpg');

DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
    `customer_id` bigint NOT NULL AUTO_INCREMENT,
    `customer_name` varchar(255) DEFAULT NULL,
    `customer_email` varchar(255) DEFAULT NULL,
    `customer_pass` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);
INSERT INTO `ecomm_app`.customers
VALUES (1, 'Ryan', 'ryan@email.com', 'password');