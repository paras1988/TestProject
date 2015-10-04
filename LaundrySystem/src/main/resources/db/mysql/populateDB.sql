INSERT IGNORE INTO users VALUES (1, 'James', 'Carter','J.c@mail.com','cc');
INSERT IGNORE INTO users VALUES (2, 'Helen', 'Leary','J.c@mail.com','cc');
INSERT IGNORE INTO users VALUES (3, 'Linda', 'Douglas','J.c@mail.com','cc');
INSERT IGNORE INTO users VALUES (4, 'Rafael', 'Ortega','J.c@mail.com','cc');
INSERT IGNORE INTO users VALUES (5, 'Henry', 'Stevens','J.c@mail.com','cc');
INSERT IGNORE INTO users VALUES (6, 'Sharon', 'Jenkins','J.c@mail.com','cc');


INSERT IGNORE INTO address VALUES (1, 'ABC','403','DMART','BANER','Address... address',1);
INSERT IGNORE INTO address VALUES (2, 'ABC','403','DMART','BANER','Address... address',2);
INSERT IGNORE INTO address VALUES (3, 'ABC','403','DMART','BANER','Address... address',2);
INSERT IGNORE INTO address VALUES (4, 'ABC','403','DMART','BANER','Address... address',3);
INSERT IGNORE INTO address VALUES (5, 'ABC','403','DMART','BANER','Address... address',4);
INSERT IGNORE INTO address VALUES (6, 'ABC','403','DMART','BANER','Address... address',5);


INSERT IGNORE INTO laundries VALUES (1, 'Leo', 'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (2, 'Basil', 'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (3, 'Rosy', 'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (4, 'Jewel', 'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (5, 'Iggy',  'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (6, 'George',  'baner','Full Address');
INSERT IGNORE INTO laundries VALUES (7, 'Samantha', 'baner','Full Address');


INSERT IGNORE INTO orderDetails VALUES (1, 'serviceType','IRON','2000-09-07',11,'2000-09-22','1',1,1,1);
INSERT IGNORE INTO orderDetails VALUES (2, 'serviceType','IRON','2000-09-07',11,'2000-09-22','1',1,1,2);
INSERT IGNORE INTO orderDetails VALUES (3, 'serviceType','IRON','2000-09-07',11,'2000-09-22','1',2,2,3);
INSERT IGNORE INTO orderDetails VALUES (4, 'serviceType','IRON','2000-09-07',11,'2000-09-22','1',3,2,3);
INSERT IGNORE INTO orderDetails VALUES (5, 'serviceType','IRON','2000-09-07',11,'2000-09-22','1',3,2,3);


INSERT IGNORE INTO items VALUES (1, 'SHIRT', '11', '12', '23');
INSERT IGNORE INTO items VALUES (2, 'T_SHIRT', '11', '12', '23');
INSERT IGNORE INTO items VALUES (3, 'PANT', '11', '12', '23');
INSERT IGNORE INTO items VALUES (4, 'JEANS', '11', '12', '23');
INSERT IGNORE INTO items VALUES (5, 'KURTA', '11', '12', '23');
INSERT IGNORE INTO items VALUES (6, 'SUIT', '11', '12', '23');


INSERT IGNORE INTO laundry_item VALUES (1, 1,'21','32','11');
INSERT IGNORE INTO laundry_item VALUES (1, 2,'21','32','11');
INSERT IGNORE INTO laundry_item VALUES (2, 1,'21','32','11');
INSERT IGNORE INTO laundry_item VALUES (2, 2,'21','32','11');
INSERT IGNORE INTO laundry_item VALUES (2, 3,'21','32','11');

-----------------------------------------------------------
-----------------------------------------------------------
-----------------------------------------------------------
INSERT IGNORE INTO laundry_order VALUES (1, 1);
INSERT IGNORE INTO laundry_order VALUES (1, 2);
INSERT IGNORE INTO laundry_order VALUES (2, 3);
INSERT IGNORE INTO laundry_order VALUES (2, 4);

INSERT IGNORE INTO user_address VALUES (1, 1);
INSERT IGNORE INTO user_address VALUES (2, 2);
INSERT IGNORE INTO user_address VALUES (2, 3);
INSERT IGNORE INTO user_address VALUES (2, 4);
INSERT IGNORE INTO user_address VALUES (3, 5);