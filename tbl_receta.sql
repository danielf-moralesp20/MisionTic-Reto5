CREATE TABLE tbl_receta(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	fk_posion int NOT NULL, 
	fk_ingrediente int NOT NULL, 
	fecha timestamp NULL DEFAULT NOW(),
	FOREIGN KEY(fk_posion) REFERENCES tbl_posion(id),
	FOREIGN KEY(fk_ingrediente) REFERENCES tbl_ingrediente(id)
);