-- MySQL dump 10.13  Distrib 8.0.23, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: parse_xml
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Address`
--

DROP TABLE IF EXISTS `Address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Address` (
  `person_id` char(255) DEFAULT NULL COMMENT '外键：对应person表的id',
  `AddressLine` char(255) DEFAULT NULL,
  `AddressCity` char(255) DEFAULT NULL,
  `AddressCountry` char(255) DEFAULT NULL,
  `URL` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Address`
--

LOCK TABLES `Address` WRITE;
/*!40000 ALTER TABLE `Address` DISABLE KEYS */;
/*!40000 ALTER TABLE `Address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Country`
--

DROP TABLE IF EXISTS `Country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Country` (
  `CountryType` char(255) DEFAULT NULL,
  `Code` char(255) DEFAULT NULL COMMENT 'CountryValue标签下的的code，就一个字段之间提出来到country表',
  `person_id` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Country`
--

LOCK TABLES `Country` WRITE;
/*!40000 ALTER TABLE `Country` DISABLE KEYS */;
/*!40000 ALTER TABLE `Country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Date`
--

DROP TABLE IF EXISTS `Date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Date` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自定义主键',
  `person_id` char(255) DEFAULT NULL COMMENT '外键指向person表',
  `DateType` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Date`
--

LOCK TABLES `Date` WRITE;
/*!40000 ALTER TABLE `Date` DISABLE KEYS */;
/*!40000 ALTER TABLE `Date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DateValue`
--

DROP TABLE IF EXISTS `DateValue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DateValue` (
  `Date_id` bigint DEFAULT NULL COMMENT '外键指向person表',
  `Day` char(255) DEFAULT NULL,
  `Month` char(255) DEFAULT NULL,
  `Year` char(255) DEFAULT NULL,
  `Dnotes` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DateValue`
--

LOCK TABLES `DateValue` WRITE;
/*!40000 ALTER TABLE `DateValue` DISABLE KEYS */;
/*!40000 ALTER TABLE `DateValue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Description`
--

DROP TABLE IF EXISTS `Description`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Description` (
  `person_id` char(255) DEFAULT NULL COMMENT '外键:对应Name表的id属性',
  `Description1` char(255) DEFAULT NULL,
  `Description2` char(255) DEFAULT NULL,
  `Description3` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Description`
--

LOCK TABLES `Description` WRITE;
/*!40000 ALTER TABLE `Description` DISABLE KEYS */;
/*!40000 ALTER TABLE `Description` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ID`
--

DROP TABLE IF EXISTS `ID`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ID` (
  `person_id` char(255) DEFAULT NULL COMMENT '对应Person表的id',
  `IDType` char(255) DEFAULT NULL,
  `IDValue` char(255) DEFAULT NULL,
  `IDNotes` longtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ID`
--

LOCK TABLES `ID` WRITE;
/*!40000 ALTER TABLE `ID` DISABLE KEYS */;
/*!40000 ALTER TABLE `ID` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Image`
--

DROP TABLE IF EXISTS `Image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Image` (
  `person_id` char(255) DEFAULT NULL,
  `URL` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Image`
--

LOCK TABLES `Image` WRITE;
/*!40000 ALTER TABLE `Image` DISABLE KEYS */;
/*!40000 ALTER TABLE `Image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Name`
--

DROP TABLE IF EXISTS `Name`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Name` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自定义主键：方便关联NameValue',
  `person_id` char(255) DEFAULT NULL COMMENT '外键:对应Person表的属性',
  `NameType` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Name`
--

LOCK TABLES `Name` WRITE;
/*!40000 ALTER TABLE `Name` DISABLE KEYS */;
/*!40000 ALTER TABLE `Name` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NameValue`
--

DROP TABLE IF EXISTS `NameValue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `NameValue` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自定义主键：方便关联NameValue',
  `name_id` char(255) DEFAULT NULL COMMENT '外键:对应Name表的属性',
  `TitleHonorific` char(255) DEFAULT NULL,
  `FirstName` char(255) DEFAULT NULL,
  `MiddleName` char(255) DEFAULT NULL,
  `Surname` char(255) DEFAULT NULL,
  `MaidenName` char(255) DEFAULT NULL,
  `EntityName` char(255) DEFAULT NULL,
  `OriginalScriptName` char(255) DEFAULT NULL,
  `Suffix` char(255) DEFAULT NULL,
  `SingleStringName` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NameValue`
--

LOCK TABLES `NameValue` WRITE;
/*!40000 ALTER TABLE `NameValue` DISABLE KEYS */;
/*!40000 ALTER TABLE `NameValue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OccTitle`
--

DROP TABLE IF EXISTS `OccTitle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `OccTitle` (
  `roles_id` bigint DEFAULT NULL COMMENT '外键指向Role表',
  `SinceDay` char(255) DEFAULT NULL,
  `SinceMonth` char(255) DEFAULT NULL,
  `SinceYear` char(255) DEFAULT NULL,
  `ToDay` char(255) DEFAULT NULL,
  `ToMonth` char(255) DEFAULT NULL,
  `ToYear` char(255) DEFAULT NULL,
  `OccCat` char(255) DEFAULT NULL,
  `value` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OccTitle`
--

LOCK TABLES `OccTitle` WRITE;
/*!40000 ALTER TABLE `OccTitle` DISABLE KEYS */;
/*!40000 ALTER TABLE `OccTitle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Person`
--

DROP TABLE IF EXISTS `Person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Person` (
  `id` char(255) DEFAULT NULL,
  `action` char(255) DEFAULT NULL,
  `date` char(255) DEFAULT NULL,
  `Gender` char(255) DEFAULT NULL,
  `ActiveStatus` char(255) DEFAULT NULL,
  `Deceased` char(255) DEFAULT NULL,
  `ProfileNotes` longtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Person`
--

LOCK TABLES `Person` WRITE;
/*!40000 ALTER TABLE `Person` DISABLE KEYS */;
/*!40000 ALTER TABLE `Person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Place`
--

DROP TABLE IF EXISTS `Place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Place` (
  `person_id` char(255) DEFAULT NULL COMMENT '对应Person表的id',
  `name` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Place`
--

LOCK TABLES `Place` WRITE;
/*!40000 ALTER TABLE `Place` DISABLE KEYS */;
/*!40000 ALTER TABLE `Place` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reference`
--

DROP TABLE IF EXISTS `Reference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Reference` (
  `person_id` char(255) DEFAULT NULL COMMENT '对应Person表的id',
  `SinceDay` char(255) DEFAULT NULL,
  `SinceMonth` char(255) DEFAULT NULL,
  `SinceYear` char(255) DEFAULT NULL,
  `ToDay` char(255) DEFAULT NULL,
  `ToMonth` char(255) DEFAULT NULL,
  `ToYear` char(255) DEFAULT NULL,
  `value` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reference`
--

LOCK TABLES `Reference` WRITE;
/*!40000 ALTER TABLE `Reference` DISABLE KEYS */;
/*!40000 ALTER TABLE `Reference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Role`
--

DROP TABLE IF EXISTS `Role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自定义主键',
  `person_id` char(255) DEFAULT NULL COMMENT '外键：对应person表的id',
  `RoleType` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Role`
--

LOCK TABLES `Role` WRITE;
/*!40000 ALTER TABLE `Role` DISABLE KEYS */;
/*!40000 ALTER TABLE `Role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Source`
--

DROP TABLE IF EXISTS `Source`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Source` (
  `person_id` char(255) DEFAULT NULL,
  `name` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Source`
--

LOCK TABLES `Source` WRITE;
/*!40000 ALTER TABLE `Source` DISABLE KEYS */;
/*!40000 ALTER TABLE `Source` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-25 16:03:16
