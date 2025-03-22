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
    (2, 'Baseball', 'A ball for baseball', 5.97, 'sports', '/product-images/baseball.jpg'),
    (3, 'T-Shirt', 'A piece of clothing', 10.35, 'clothing', '/product-images/tshirt.jpg'),
    (4, 'Bike', 'A bicycle to ride.', 120.38, 'sports', '/product-images/bike.jpg'),
    (5, 'Orange', 'Good for juice.', 4.30, 'food', '/product-images/orange.jpg'),
    (6, 'Pants', 'A comfy pair of pants..', 60.56, 'clothing', '/product-images/pants.jpg'),
    (7, 'Hammer', 'A good hammer.', 738.34, 'tools', '/product-images/hammer.jpg'),
    (8, 'Football', 'Go Birds!.', 56.38, 'sports', '/product-images/football.jpg'),
    (9, 'Basketball', 'Perfect for indoor and outdoor play.', 45.99, 'sports', '/product-images/basketball.jpg'),
    (10, 'Laptop Stand', 'Ergonomic design for better posture.', 29.99, 'electronics', '/product-images/laptop-stand.jpg'),
    (11, 'Acoustic Guitar', 'Ideal for beginners and professionals.', 199.99, 'music', '/product-images/acoustic-guitar.jpg'),
    (12, 'Running Shoes', 'Lightweight and comfortable for long runs.', 89.99, 'apparel', '/product-images/running-shoes.jpg'),
    (13, 'Wireless Headphones', 'Noise-canceling with crystal-clear sound.', 119.99, 'electronics', '/product-images/wireless-headphones.jpg'),
    (14, 'Camping Tent', 'Waterproof and wind-resistant for outdoor adventures.', 149.99, 'outdoors', '/product-images/camping-tent.jpg'),
    (15, 'Coffee Maker', 'Brews the perfect cup every time.', 79.99, 'home', '/product-images/coffee-maker.jpg'),
    (16, 'Smart Watch', 'Tracks fitness, heart rate, and notifications.', 159.99, 'electronics', '/product-images/smart-watch.jpg'),
    (17, 'Yoga Mat', 'Non-slip surface for ultimate grip.', 24.99, 'fitness', '/product-images/yoga-mat.jpg'),
    (18, 'Desk Lamp', 'LED lighting with adjustable brightness.', 34.99, 'home', '/product-images/desk-lamp.jpg'),
    (19, 'Electric Scooter', 'Eco-friendly and fun to ride.', 299.99, 'transportation', '/product-images/electric-scooter.jpg'),
    (20, 'Board Game', 'Fun for the whole family.', 39.99, 'toys', '/product-images/board-game.jpg');


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