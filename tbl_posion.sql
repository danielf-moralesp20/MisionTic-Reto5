CREATE TABLE tbl_posion(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre varchar(30) NOT NULL, 
	litros decimal(10,2) NOT NULL, 
	utilidad int NULL DEFAULT 0, 
	fk_escuela int NOT NULL,
	FOREIGN KEY(fk_escuela) REFERENCES tbl_escuela(id)
);