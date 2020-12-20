DROP TABLE IF EXISTS Product;

CREATE TABLE Product (
  product_id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  product_details VARCHAR(250) NOT NULL,
  price DOUBLE
);

INSERT INTO Product(product_name, product_details, price) VALUES
  ('shoe', 'better for running', 70),
  ('bag', 'backpack',80);