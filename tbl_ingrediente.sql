CREATE TABLE tbl_ingrediente(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre varchar(30) NOT NULL, 
	peso_approx int NULL DEFAULT 0, 
	nivel_reaccion decimal(3,1) NOT NULL,
	existe bool NOT NULL,
	CHECK(nivel_reaccion >= 0 and nivel_reaccion <= 10)
);