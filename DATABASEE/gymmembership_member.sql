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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `mID` int NOT NULL,
  `mPhone` varchar(45) NOT NULL,
  `mName` varchar(45) NOT NULL,
  `mSurname` varchar(45) NOT NULL,
  `mWeight` varchar(45) NOT NULL,
  `mHeight` varchar(45) NOT NULL,
  `branch_name` varchar(45) DEFAULT NULL,
  `trainer_id` int DEFAULT NULL,
  PRIMARY KEY (`mID`),
  KEY `idx_member_mPhone` (`mPhone`),
  KEY `idx_member_branch_name` (`branch_name`),
  KEY `fk_member_trainer` (`trainer_id`),
  CONSTRAINT `member_ibfk_1` FOREIGN KEY (`branch_name`) REFERENCES `gym` (`branch_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (111111,'555-444-333','Taha','Sökelen','100','1.90','Emek',1002),(123123,'555-123-123','Mine Esra','Beşiroğlu','65','1.65','Bahçelievler',1003),(222222,'555-444-222','Alp','Demiral','85','1.70','Çayyolu',1001),(321321,'555-321-321','Bengisu','Kılıç','42','1.60','Emek',1001),(333333,'555-444-111','Damla','Düzgün','60','1.70','Bahçelievler',1002),(444444,'555-333-444','Sude','Akkaya','50','1.50','Tunalı',1000),(555555,'555-666-777','Mehmet','Gülşen','85','1.80','Emek',1000),(666666,'555-111-222','Ali','Osmanoğlu','103','1.95','Çayyolu',1001),(741741,'555-741-741','Jankat','Karagöz','100','1.95','Çayyolu',1002),(753753,'555-753-753','Büşra','Akil','45','1.53','Çayyolu',1002),(777777,'555-111-333','Osman','Köşker','67','1.70','Bahçelievler',1003),(852852,'555-852-852','Ceren','Altın','55','1.65','Tunalı',1001),(888888,'555-222-111','Cem','Yılmaz','90','1.69','Çayyolu',1003),(951951,'555-951-951','Kübra ','Güneş','59','1.71','Emek',1000),(963963,'555-963-963','Zeynep','Umay','35','1.40','Bahçelievler',1002),(999999,'555-222-222','Hakan','Altın','95','1.89','Çayyolu',1002);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
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
