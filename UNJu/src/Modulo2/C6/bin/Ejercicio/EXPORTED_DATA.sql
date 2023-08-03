-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: punto2
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
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `libreta_universitaria` int NOT NULL,
  `dni` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `fecha_nac` varchar(45) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`libreta_universitaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (1,'11111111','KATNISS','EVERDEEN','CALLE FALSA 123','1998-02-03','1125362548','PROGRAMACION'),(2,'22222222','PEETA','MELLARK','CALLE FALSA 234','1994-05-12','1145864295','PROGRAMACION'),(3,'33333333','KATHERINE','PIERCE','CALLE FALSA 345','2001-11-01','1117823654','PROGRAMACION');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumnos_comisiones`
--

DROP TABLE IF EXISTS `alumnos_comisiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos_comisiones` (
  `id_libreta` int NOT NULL,
  `id_codigo` int NOT NULL,
  KEY `libreta_universitaria_idx` (`id_libreta`),
  KEY `id_codigo_idx` (`id_codigo`),
  CONSTRAINT `id_codigo` FOREIGN KEY (`id_codigo`) REFERENCES `comisiones` (`id_codigo`),
  CONSTRAINT `id_libreta` FOREIGN KEY (`id_libreta`) REFERENCES `alumnos` (`libreta_universitaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos_comisiones`
--

LOCK TABLES `alumnos_comisiones` WRITE;
/*!40000 ALTER TABLE `alumnos_comisiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumnos_comisiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumnos_materias`
--

DROP TABLE IF EXISTS `alumnos_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos_materias` (
  `id_alumnos` int NOT NULL,
  `id_materias` int NOT NULL,
  KEY `id_libretauniversitaria_idx` (`id_alumnos`),
  KEY `id_materias_idx` (`id_materias`),
  CONSTRAINT `id_alumnos` FOREIGN KEY (`id_alumnos`) REFERENCES `alumnos` (`libreta_universitaria`),
  CONSTRAINT `id_materias` FOREIGN KEY (`id_materias`) REFERENCES `asignatura` (`id_asignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos_materias`
--

LOCK TABLES `alumnos_materias` WRITE;
/*!40000 ALTER TABLE `alumnos_materias` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumnos_materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignatura` (
  `id_asignatura` int NOT NULL,
  `nombre_asignatura` varchar(45) NOT NULL,
  `horas_catedra` int NOT NULL,
  PRIMARY KEY (`id_asignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comisiones`
--

DROP TABLE IF EXISTS `comisiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comisiones` (
  `id_codigo` int NOT NULL,
  `cant_alumnos` int NOT NULL,
  `tipo_comision` int NOT NULL,
  `asignatura` varchar(45) NOT NULL,
  PRIMARY KEY (`id_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comisiones`
--

LOCK TABLES `comisiones` WRITE;
/*!40000 ALTER TABLE `comisiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `comisiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profes_materias`
--

DROP TABLE IF EXISTS `profes_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profes_materias` (
  `id_profesores` int NOT NULL,
  `id_materias` int NOT NULL,
  KEY `id_legajo_idx` (`id_profesores`),
  KEY `id_asignatura_idx` (`id_materias`),
  CONSTRAINT `id_materia` FOREIGN KEY (`id_materias`) REFERENCES `asignatura` (`id_asignatura`),
  CONSTRAINT `id_profesor` FOREIGN KEY (`id_profesores`) REFERENCES `profesores` (`id_legajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profes_materias`
--

LOCK TABLES `profes_materias` WRITE;
/*!40000 ALTER TABLE `profes_materias` DISABLE KEYS */;
/*!40000 ALTER TABLE `profes_materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `id_legajo` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `fecha_nac` varchar(10) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `titulo_universitario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_legajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (1,'MILANESO','ROJAS','1990-03-03','1145286525','LICENCIATURA EN PROGRAMACION'),(2,'PUCHI','VALDEZ','1980-12-12','1145748596','LICENCIATURA EN PROGRAMACION'),(3,'GELATINO','NILO','1992-04-11','1163524586','LICENCIATURA EN PROGRAMACION');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-08 20:57:42
