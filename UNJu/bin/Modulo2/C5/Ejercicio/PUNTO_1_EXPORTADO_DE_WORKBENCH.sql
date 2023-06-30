-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: tp5
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cursos_arg_programa`
--

DROP TABLE IF EXISTS `cursos_arg_programa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos_arg_programa` (
  `id_codigo` int NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `carga_horaria_semanal` int NOT NULL,
  `remuneracion` int NOT NULL,
  `institucion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_codigo`),
  UNIQUE KEY `id_codigo_UNIQUE` (`id_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos_arg_programa`
--

LOCK TABLES `cursos_arg_programa` WRITE;
/*!40000 ALTER TABLE `cursos_arg_programa` DISABLE KEYS */;
/*!40000 ALTER TABLE `cursos_arg_programa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docentes_arg_programa`
--

DROP TABLE IF EXISTS `docentes_arg_programa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docentes_arg_programa` (
  `legajo` int NOT NULL,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `segundo_nombre` varchar(45) NOT NULL,
  `fecha_nac` date NOT NULL,
  `fecha_contrato` date NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `id_curso` int NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `legajo_UNIQUE` (`legajo`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  UNIQUE KEY `id_curso_UNIQUE` (`id_curso`),
  KEY `id_codigo_idx` (`id_curso`),
  CONSTRAINT `id_codigo` FOREIGN KEY (`id_curso`) REFERENCES `cursos_arg_programa` (`id_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docentes_arg_programa`
--

LOCK TABLES `docentes_arg_programa` WRITE;
/*!40000 ALTER TABLE `docentes_arg_programa` DISABLE KEYS */;
/*!40000 ALTER TABLE `docentes_arg_programa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-29 17:58:26
