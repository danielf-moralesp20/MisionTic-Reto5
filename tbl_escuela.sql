/*CREATE database Escuela;*/
USE Escuela;
CREATE TABLE tbl_escuela(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre varchar(40) NOT NULL, 
	habilidad varchar(40) NOT NULL, 
	anios_servicio int NOT NULL, 
	creador varchar(20) NOT NULL,
	fecha_inicio date NOT NULL
);
