-- -------------------------------------------------------------
-- TablePlus 3.5.0(308)
--
-- https://tableplus.com/
--
-- Database: paintball
-- Generation Time: 2020-05-25 00:23:07.4700
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


DROP TABLE IF EXISTS `administrador`;
CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_admin` varchar(255) DEFAULT NULL,
  `apellido_admin` varchar(255) DEFAULT NULL,
  `nombre2_admin` varchar(255) DEFAULT NULL,
  `apellido2_admin` varchar(255) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `cedula` varchar(100) DEFAULT NULL,
  `contrasena` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idAdministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `canchas`;
CREATE TABLE `canchas` (
  `idCancha` int(11) NOT NULL AUTO_INCREMENT,
  `disponibilidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCancha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(255) DEFAULT NULL,
  `apellido_cliente` varchar(255) DEFAULT NULL,
  `nombre2_cliente` varchar(255) DEFAULT NULL,
  `apellido2_cliente` varchar(255) DEFAULT NULL,
  `telefonC` varchar(20) DEFAULT NULL,
  `cedulaC` varchar(20) DEFAULT NULL,
  `correoC` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `detalle_venta`;
CREATE TABLE `detalle_venta` (
  `idDetalle_Venta` int(11) NOT NULL AUTO_INCREMENT,
  `valor_unitario` int(11) DEFAULT NULL,
  `cantidadP` int(11) DEFAULT NULL,
  `valor_iva` int(11) DEFAULT NULL,
  `venta_ref` int(11) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  `partida` int(11) DEFAULT NULL,
  PRIMARY KEY (`idDetalle_Venta`),
  KEY `venta_ref` (`venta_ref`),
  KEY `producto` (`producto`),
  KEY `partida` (`partida`),
  CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`venta_ref`) REFERENCES `venta` (`idVenta`),
  CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`producto`) REFERENCES `productos` (`idProducto`),
  CONSTRAINT `detalle_venta_ibfk_3` FOREIGN KEY (`partida`) REFERENCES `partida` (`idPartida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `partida`;
CREATE TABLE `partida` (
  `idPartida` int(11) NOT NULL AUTO_INCREMENT,
  `hora_entrada` time DEFAULT NULL,
  `hora_salida` time DEFAULT NULL,
  `fecha_partida` date DEFAULT NULL,
  PRIMARY KEY (`idPartida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(255) DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `foto_referencia` varchar(255) DEFAULT NULL,
  `precio_producto` int(11) DEFAULT NULL,
  `descripcionP` varchar(255) DEFAULT NULL,
  `cantidad_disponible` int(11) DEFAULT NULL,
  `iva` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `reservas`;
CREATE TABLE `reservas` (
  `idReserva` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_reserva` varchar(255) DEFAULT NULL,
  `cantidad_personas` int(10) DEFAULT NULL,
  `fecha_reserva` date DEFAULT NULL,
  `hora_reserva` time DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  `cancha` int(11) DEFAULT NULL,
  PRIMARY KEY (`idReserva`),
  KEY `cliente` (`cliente`),
  KEY `cancha` (`cancha`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`idCliente`),
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`cancha`) REFERENCES `canchas` (`idCancha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `venta`;
CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_venta` date DEFAULT NULL,
  `total_venta` int(11) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  `admin` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `cliente` (`cliente`),
  KEY `admin` (`admin`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`idCliente`),
  CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`admin`) REFERENCES `administrador` (`idAdministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `administrador` (`idAdministrador`, `nombre_admin`, `apellido_admin`, `nombre2_admin`, `apellido2_admin`, `telefono`, `cedula`, `contrasena`) VALUES
('1', 'admin', 'admin', 'admin', 'admin', '12333', '3939393', '123456');

INSERT INTO `productos` (`idProducto`, `nombre_producto`, `fecha_vencimiento`, `foto_referencia`, `precio_producto`, `descripcionP`, `cantidad_disponible`, `iva`) VALUES
('2', 'choclitos', '2020-05-19', 'nada', '1500', 'papitas', '10', '16');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;