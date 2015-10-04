CREATE DATABASE IF NOT EXISTS laundry;
GRANT ALL PRIVILEGES ON laundry.* TO paras@localhost IDENTIFIED BY 'paras';

USE laundry;

CREATE TABLE IF NOT EXISTS users (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  emailId   VARCHAR(20),
  password VARCHAR(20),
  INDEX(last_name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS address (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  loctag VARCHAR(50),
  flatNumber VARCHAR(50),
  landmark VARCHAR(50),
  locality VARCHAR(50),
  address VARCHAR(200),
  user_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users(id),
  INDEX(loctag)
) engine=InnoDB;

CREATE TABLE IF not EXISTS laundries(
	id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	locality VARCHAR(50),
  	address VARCHAR(200)
)engine=InnoDB;

CREATE TABLE IF not EXISTS orderDetails(
	id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
	serviceType VARCHAR(50),
	washType VARCHAR(50),
	pickUpDate DATE,
	pickUpSlot INT(3),
	delieveryDate DATE,
	delieverySlot INT(3),
	user_id INT(4) UNSIGNED NOT NULL,
	address_id INT(4) UNSIGNED NOT NULL,
	laundry_id INT(4) UNSIGNED NOT NULL,
	FOREIGN KEY (address_id) REFERENCES address(id),
	FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (laundry_id) REFERENCES laundries(id)
)engine=InnoDB;

CREATE TABLE IF not EXISTS items(
	id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	washIronPrice VARCHAR(10),
	drycleanPrice VARCHAR(10),
	ironPrice VARCHAR(10)
)engine=InnoDB;

CREATE TABLE IF not EXISTS laundry_item(
	laundry_id INT(4) UNSIGNED NOT NULL,
	item_id INT(4) UNSIGNED NOT NULL,
	FOREIGN KEY (laundry_id) REFERENCES laundries(id),
	FOREIGN KEY (item_id) REFERENCES items(id),
	washIronPrice VARCHAR(10),
	drycleanPrice VARCHAR(10),
	ironPrice VARCHAR(10),
	UNIQUE (laundry_id,item_id)
) engine=InnoDB;

--CREATE TABLE IF not EXISTS laundry_order(
--	laundry_id INT(4) UNSIGNED NOT NULL,
--	order_id INT(4) UNSIGNED NOT NULL,
--	FOREIGN KEY (laundry_id) REFERENCES laundries(id),
--	FOREIGN KEY (order_id) REFERENCES orderDetails(id),
--	UNIQUE (laundry_id,order_id)
--) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS user_address(
--	user_id INT(4) UNSIGNED NOT NULL,
--	address_id INT(4) UNSIGNED NOT NULL,
--	FOREIGN KEY (user_id) REFERENCES users(id),
--	FOREIGN KEY (address_id) REFERENCES address(id),
--	UNIQUE (user_id,address_id)
--) engine=InnoDB;
