CREATE DATABASE locavrum;

USE locavrum;

CREATE TABLE Carros (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	marca VARCHAR(10) NOT NULL,
	modelo VARCHAR(25) NOT NULL,
	ano INT NOT NULL,
	quilometragem LONG NOT NULL,
	precoAluguel DOUBLE NOT NULL,
	alugado BOOLEAN NOT NULL
	-- anoFabricacao DATE
);

DESC Carros;

SELECT * FROM Carros;

DROP TABLE Carros;
