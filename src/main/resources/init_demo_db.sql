-- Demo database
-- Source https://www.w3schools.com/postgresql/postgresql_create_demodatabase.php


CREATE TABLE categories (
                            category_id SERIAL NOT NULL PRIMARY KEY,
                            category_name VARCHAR(255),
                            description VARCHAR(255)
);

CREATE TABLE customers (
                           customer_id SERIAL NOT NULL PRIMARY KEY,
                           customer_name VARCHAR(255),
                           contact_name VARCHAR(255),
                           address VARCHAR(255),
                           city VARCHAR(255),
                           postal_code VARCHAR(255),
                           country VARCHAR(255)
);

CREATE TABLE products (
                          product_id SERIAL NOT NULL PRIMARY KEY,
                          product_name VARCHAR(255),
                          category_id INT,
                          unit VARCHAR(255),
                          price DECIMAL(10, 2)
);

CREATE TABLE orders (
                        order_id SERIAL NOT NULL PRIMARY KEY,
                        customer_id INT,
                        order_date DATE
);

CREATE TABLE order_details (
                               order_detail_id SERIAL NOT NULL PRIMARY KEY,
                               order_id INT,
                               product_id INT,
                               quantity INT
);

CREATE TABLE testproducts (
                              testproduct_id SERIAL NOT NULL PRIMARY KEY,
                              product_name VARCHAR(255),
                              category_id INT
);