CREATE TABLE IF NOT EXISTS `movimiento_banco` (
`id` int NOT NULL AUTO_INCREMENT,
`nro_operacion` varchar(20) NOT NULL,
`importe` decimal(10,2) NOT NULL,
`fecha_proceso` date NOT NULL,
PRIMARY KEY(`id`));