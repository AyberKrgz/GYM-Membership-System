-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: gymmembership
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `membership` (
  `position` int NOT NULL AUTO_INCREMENT,
  `membership_duration` varchar(15) NOT NULL,
  `membership_type` varchar(45) NOT NULL,
  `mPhone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`position`),
  KEY `mPhone` (`mPhone`),
  CONSTRAINT `membership_ibfk_1` FOREIGN KEY (`mPhone`) REFERENCES `member` (`mPhone`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership`
--

LOCK TABLES `membership` WRITE;
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
INSERT INTO `membership` VALUES (9,'12 Months','Platinum','555-444-333'),(10,'6 Months','Gold','555-444-222'),(11,'1 Month','Silver','555-444-111'),(14,'3 Months','Gold','555-333-444'),(16,'12 Months','Platinum','555-666-777'),(23,'6 Months','Gold','555-111-222'),(24,'3 Months','Silver','555-111-333'),(25,'12 Months','Platinum','555-222-111'),(26,'6 Months','Gold','555-222-222'),(27,'3 Months','Silver','555-123-123'),(28,'6 Months','Gold','555-321-321'),(29,'12 Months','Platinum','555-753-753'),(30,'12 Months','Silver','555-951-951'),(31,'3 Months','Gold','555-852-852'),(32,'12 Months','Silver','555-741-741'),(33,'1 Month','Silver','555-963-963');
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-08 23:10:02
