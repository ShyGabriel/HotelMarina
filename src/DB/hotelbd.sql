-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2025 a las 11:21:47
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id` int(11) NOT NULL,
  `dni` varchar(15) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido_paterno` varchar(50) NOT NULL,
  `apellido_materno` varchar(50) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `num_habitacion` int(11) NOT NULL,
  `tipo_habitacion` varchar(50) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `fecha_reserva` timestamp NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`id`, `dni`, `nombre`, `apellido_paterno`, `apellido_materno`, `correo`, `telefono`, `num_habitacion`, `tipo_habitacion`, `precio`, `fecha_entrada`, `fecha_salida`, `fecha_reserva`) VALUES
(1, '12345678', 'Juan', 'Pérez', 'García', 'juan@example.com', '987654321', 101, 'HABITACION INDIVIDUAL', 300.00, NULL, NULL, '2025-06-15 06:44:21'),
(2, '87654321', 'Ana', 'Ramírez', 'López', 'ana@example.com', '912345678', 202, 'HABITACION TRIPLE', 150.00, NULL, NULL, '2025-06-15 06:44:21'),
(6, '12005678', 'Luis', 'Pérez', 'García', 'luis.perez@gmail.com', '987654321', 101, 'HABITACION INDIVIDUAL', 150.00, NULL, NULL, '2025-06-15 06:44:21'),
(4, '65478932', 'User', 'demo', 'demo 2', 'userdemo@gmail.com', '123456789', 10, 'HABITACION DOBLE', 0.00, NULL, NULL, '2025-06-15 06:44:21'),
(5, '76148377', 'Luis Noé', 'Pampayaupa', 'Quispe', 'luispampayaupa@gmail.com', '9632541789', 96, 'HABITACION PRESIDENCIAL', 200.00, NULL, NULL, '2025-06-15 06:50:21'),
(7, '87654300', 'María', 'Ramírez', 'Lopez', 'maria.ramirez@hotmail.com', '956123456', 102, 'HABITACION DOBLE', 200.00, NULL, NULL, '2025-06-15 06:52:21'),
(8, '11223344', 'Carlos', 'Sánchez', 'Martinez', 'carlos.sanchez@yahoo.com', '944789321', 103, 'HABITACION TRIPLE', 250.00, NULL, NULL, '2025-06-15 06:44:21'),
(9, '99887766', 'Ana', 'Díaz', 'Quispe', 'ana.diaz@gmail.com', '933456987', 104, 'HABITACION CUADRUPLE', 300.00, NULL, NULL, '2025-06-15 06:44:21'),
(10, '55667788', 'Javier', 'Torres', 'Morales', 'jtorres@empresa.com', '922998877', 105, 'HABITACION SUITE', 400.00, NULL, NULL, '2025-06-15 06:44:21'),
(11, '77889900', 'Lucía', 'Castro', 'Reyes', 'lucia.castro@correo.pe', '911223344', 106, 'HABITACION PRESIDENCIAL', 600.00, NULL, NULL, '2025-06-15 06:44:21'),
(12, '44556677', 'Diego', 'Fernández', 'Alarcón', 'diego.fernandez@mail.com', '987112233', 107, 'HABITACION DOBLE', 210.00, NULL, NULL, '2025-07-16 20:59:02'),
(13, '33221100', 'Valeria', 'Moreno', 'Huamán', 'valeria.moreno@gmail.com', '924334455', 108, 'HABITACION INDIVIDUAL', 155.00, NULL, NULL, '2025-07-16 20:59:02'),
(14, '99008877', 'Andrés', 'Salazar', 'Cárdenas', 'andres.salazar@hotmail.com', '976889900', 109, 'HABITACION SUITE', 450.00, NULL, NULL, '2025-07-16 20:59:02'),
(15, '12121212', 'Camila', 'Mendoza', 'Gómez', 'camila.mendoza@correo.com', '933223344', 110, 'HABITACION PRESIDENCIAL', 620.00, NULL, NULL, '2025-07-16 20:59:02'),
(16, '34343434', 'Sofía', 'Navarro', 'Paredes', 'sofia.navarro@correo.pe', '944556677', 111, 'HABITACION TRIPLE', 270.00, NULL, NULL, '2025-07-16 20:59:02'),
(17, '56565656', 'Bruno', 'Ortega', 'Soto', 'bruno.ortega@gmail.com', '955667788', 112, 'HABITACION CUADRUPLE', 310.00, NULL, NULL, '2025-07-16 20:59:02'),
(18, '78787878', 'Elena', 'Rojas', 'Delgado', 'elena.rojas@mail.com', '988776655', 113, 'HABITACION INDIVIDUAL', 160.00, NULL, NULL, '2025-07-16 20:59:02'),
(19, '90909090', 'Sebastián', 'Carranza', 'Vásquez', 'sebastian.cv@empresa.com', '977889911', 114, 'HABITACION DOBLE', 205.00, NULL, NULL, '2025-07-16 20:59:02'),
(20, '10101010', 'Alejandra', 'López', 'Aguilar', 'ale.lopez@gmail.com', '966778899', 115, 'HABITACION TRIPLE', 255.00, NULL, NULL, '2025-07-16 20:59:02'),
(21, '23232323', 'Mauricio', 'Ibáñez', 'Ramos', 'mauricio.ramos@correo.com', '944221133', 116, 'HABITACION SUITE', 420.00, NULL, NULL, '2025-07-16 20:59:02'),
(22, '73211088', 'Henry Alberto', 'Merino', 'Jaimes', 'hehema.marino@utp.edu.pe', '957703234', 102, 'HABITACION TRIPLE', 300.00, NULL, NULL, '2025-07-18 06:26:35'),
(23, '73211099', 'Alberto', 'Martinez', 'Aves', 'piquereeee@majo.pe', '999666555', 111, 'HABITACION DOBLE', 105.90, '1970-01-01', '1970-01-01', '2025-07-18 08:55:24'),
(24, '11111111', 'Gabriel', 'Mara', 'More', 'adsdad@majo.pe', '999666555', 133, 'HABITACION PRESIDENCIAL', 1250.90, '2025-07-05', '2025-07-06', '2025-07-18 09:06:18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `rol` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `password`, `nombres`, `apellidos`, `rol`) VALUES
(1, 'admin', 'admin123', 'Juan', 'Pérez', 'Administrador'),
(2, 'recepcion1', 'recep123', 'Ana', 'García', 'Recepcionista'),
(3, 'cliente1', 'cliente123', 'Carlos', 'Ramírez', 'Cliente');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
