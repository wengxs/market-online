-- MySQL dump 10.13  Distrib 5.5.47, for Win32 (x86)
--
-- Host: localhost    Database: market
-- ------------------------------------------------------
-- Server version	5.5.47

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_address`
--

DROP TABLE IF EXISTS `t_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `addressee` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `zipCode` char(6) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `t_address_fk` FOREIGN KEY (`user_id`) REFERENCES `t_users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_address`
--

LOCK TABLES `t_address` WRITE;
/*!40000 ALTER TABLE `t_address` DISABLE KEYS */;
INSERT INTO `t_address` VALUES (1,1,'Sol','GDKM','123456','15521231246'),(2,2,'鹏哥','GDKM','312321','13800138000'),(3,1,'所哥','广东科贸','233214','13432582240'),(4,1,'小翁','科贸A4-310','123456','15521231246'),(5,1,'ç¿å¹¸æ','å¹¿ä¸ç§è´¸èä¸å­¦é¢','125800','13800138000'),(6,1,'翁幸所1','广东科贸职业学院','125800','13800138000'),(7,1,'翁幸所1','广东科贸职业学院','125800','13800138000'),(9,16,'','','',''),(10,17,'','','','');
/*!40000 ALTER TABLE `t_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods_category`
--

DROP TABLE IF EXISTS `t_goods_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods_category`
--

LOCK TABLES `t_goods_category` WRITE;
/*!40000 ALTER TABLE `t_goods_category` DISABLE KEYS */;
INSERT INTO `t_goods_category` VALUES (1,'吃货天堂'),(2,'服装饰品'),(3,'数码产品'),(4,'生活用品'),(5,'虚拟物品'),(6,'其他');
/*!40000 ALTER TABLE `t_goods_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods_category_child`
--

DROP TABLE IF EXISTS `t_goods_category_child`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods_category_child` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `t_goods_category_child_fk` FOREIGN KEY (`category_id`) REFERENCES `t_goods_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods_category_child`
--

LOCK TABLES `t_goods_category_child` WRITE;
/*!40000 ALTER TABLE `t_goods_category_child` DISABLE KEYS */;
INSERT INTO `t_goods_category_child` VALUES (1,'男装',2),(2,'女装',2),(3,'配饰',2),(4,'日常用品',4),(5,'学习用品',4),(6,'床上用品',4),(7,'饮料水果',1),(8,'速食',1),(9,'手机',3),(10,'相机',3),(11,'话费流量',5),(12,'游戏点券',5),(13,'其他',6);
/*!40000 ALTER TABLE `t_goods_category_child` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods_comment`
--

DROP TABLE IF EXISTS `t_goods_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `content` text,
  `post_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `goods_id` (`goods_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `t_goods_comment_fk` FOREIGN KEY (`goods_id`) REFERENCES `t_goodses` (`id`),
  CONSTRAINT `t_goods_comment_fk1` FOREIGN KEY (`user_id`) REFERENCES `t_users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods_comment`
--

LOCK TABLES `t_goods_comment` WRITE;
/*!40000 ALTER TABLE `t_goods_comment` DISABLE KEYS */;
INSERT INTO `t_goods_comment` VALUES (1,1,1,'好难吃啊','2015-12-14 00:00:00');
/*!40000 ALTER TABLE `t_goods_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods_img`
--

DROP TABLE IF EXISTS `t_goods_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_id` int(11) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `t_goods_img_fk` FOREIGN KEY (`goods_id`) REFERENCES `t_goodses` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods_img`
--

LOCK TABLES `t_goods_img` WRITE;
/*!40000 ALTER TABLE `t_goods_img` DISABLE KEYS */;
INSERT INTO `t_goods_img` VALUES (1,1,'img_goods/1_01.jpg'),(2,1,'img_goods/1_02.jpg'),(3,2,'img_goods/1_02.jpg'),(4,2,'img_goods/1_02.jpg'),(5,3,'img_goods/3_01.jpg'),(6,3,'img_goods/3_01.jpg'),(7,4,'img_goods/4_01.jpg'),(8,4,'img_goods/4_02.jpg'),(9,4,'img_goods/4_03.jpg'),(10,5,'img_goods/5_01.jpg'),(11,5,'img_goods/5_02.jpg'),(12,5,'img_goods/5_03.jpg'),(13,6,'img_goods/6_01.jpg'),(14,6,'img_goods/6_02.jpg'),(15,6,'img_goods/6_03.jpg'),(16,7,'img_goods/7_01.jpg'),(17,7,'img_goods/7_02.jpg'),(18,7,'img_goods/7_03.jpg'),(19,8,'img_goods/8_01.jpg'),(20,8,'img_goods/8_02.jpg'),(21,8,'img_goods/8_03.jpg'),(22,9,'img_goods/9_01.jpg'),(23,9,'img_goods/9_02.jpg'),(24,9,'img_goods/9_03.jpg'),(25,10,'img_goods/10_01.jpg'),(26,10,'img_goods/10_02.jpg'),(27,10,'img_goods/10_03.jpg');
/*!40000 ALTER TABLE `t_goods_img` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goodses`
--

DROP TABLE IF EXISTS `t_goodses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goodses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `content` text,
  `category_id` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `is_sell` char(1) DEFAULT 'Y',
  `sale_time` datetime DEFAULT NULL,
  `sale_count` int(11) DEFAULT '0',
  `is_top` char(1) DEFAULT 'N',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `t_goodses_fk` FOREIGN KEY (`category_id`) REFERENCES `t_goods_category_child` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goodses`
--

LOCK TABLES `t_goodses` WRITE;
/*!40000 ALTER TABLE `t_goodses` DISABLE KEYS */;
INSERT INTO `t_goodses` VALUES (1,'2肉松饼','好吃好吃好好吃',8,1.5,996,'Y','2015-12-11 00:00:00',2,'N'),(2,'1肉松饼2','12345676542132',8,2,456,'Y','2015-12-13 00:00:00',0,'Y'),(3,'裤子','sdsads ',1,544,432,'Y','2015-12-09 00:00:00',0,'N'),(4,'好丽友 蛋黄派 注心蛋黄派 12枚/盒 (23克*12枚)','好丽友 蛋黄派 注心蛋黄派 12枚/盒 (23克*12枚)',8,21.9,4542,'Y','2015-12-14 00:00:00',3,'Y'),(5,'EGO进口燕麦巧克力468g进口饼干燕麦巧克力牛奶味','EGO进口燕麦巧克力468g进口饼干燕麦巧克力牛奶味',8,14.9,4325,'Y','2015-12-14 00:00:00',0,'N'),(6,'越南进口沙巴哇综合蔬果干脆片水果干零食特产100g','越南进口沙巴哇综合蔬果干脆片水果干零食特产100g',8,7.9,4324,'Y','2015-12-14 00:00:00',1,'Y'),(7,'新疆阿克苏冰糖心苹果1kg 约200g 新鲜水果','新疆阿克苏冰糖心苹果1kg 约200g 新鲜水果',7,19,9996,'Y','2015-12-14 00:00:00',3,'N'),(8,'Zespri佳沛新西兰绿奇异果12个95g-110g/个','Zespri佳沛新西兰绿奇异果12个95g-110g/个',7,48,9457,'Y','2015-12-14 00:00:00',2,'Y'),(9,'墨西哥牛油果4个','墨西哥牛油果4个',7,42,4459,'Y','2015-12-14 00:00:00',0,'N'),(10,'智利樱桃1kg果径26-28mm 车厘子 进口新鲜水果','智利樱桃1kg果径26-28mm 车厘子 进口新鲜水果',7,119,7435,'Y','2015-12-14 00:00:00',14,'N');
/*!40000 ALTER TABLE `t_goodses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order_content`
--

DROP TABLE IF EXISTS `t_order_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `order_id` (`order_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `t_order_content_fk` FOREIGN KEY (`order_id`) REFERENCES `t_orders` (`id`),
  CONSTRAINT `t_order_content_fk1` FOREIGN KEY (`goods_id`) REFERENCES `t_goodses` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order_content`
--

LOCK TABLES `t_order_content` WRITE;
/*!40000 ALTER TABLE `t_order_content` DISABLE KEYS */;
INSERT INTO `t_order_content` VALUES (1,1,7,19,2,38),(2,1,8,48,2,96),(3,1,10,119,4,476),(4,2,1,1.5,2,3),(5,4,10,119,10,1190),(6,5,7,19,1,19),(7,6,4,21.9,2,43.8),(8,7,4,21.9,1,21.9),(9,7,6,7.9,1,7.9);
/*!40000 ALTER TABLE `t_order_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order_status`
--

DROP TABLE IF EXISTS `t_order_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order_status`
--

LOCK TABLES `t_order_status` WRITE;
/*!40000 ALTER TABLE `t_order_status` DISABLE KEYS */;
INSERT INTO `t_order_status` VALUES (1,'等待付款'),(2,'等待收货'),(3,'已完成'),(4,'已取消');
/*!40000 ALTER TABLE `t_order_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_orders`
--

DROP TABLE IF EXISTS `t_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `order_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status_id` int(11) DEFAULT '1',
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `user_id` (`user_id`),
  KEY `status_id` (`status_id`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `t_orders_fk` FOREIGN KEY (`user_id`) REFERENCES `t_users` (`id`),
  CONSTRAINT `t_orders_fk1` FOREIGN KEY (`status_id`) REFERENCES `t_order_status` (`id`),
  CONSTRAINT `t_orders_fk2` FOREIGN KEY (`address_id`) REFERENCES `t_address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_orders`
--

LOCK TABLES `t_orders` WRITE;
/*!40000 ALTER TABLE `t_orders` DISABLE KEYS */;
INSERT INTO `t_orders` VALUES (1,1,610,'2015-12-25 11:01:36',1,4),(2,2,3,'2015-12-26 11:40:10',3,2),(3,1,1190,'2015-12-28 01:19:13',NULL,1),(4,1,1190,'2015-12-28 01:20:32',3,5),(5,1,19,'2015-12-28 01:49:52',1,4),(6,1,43.8,'2015-12-28 01:51:19',1,7),(7,16,29.799999999999997,'2015-12-28 03:03:19',1,9);
/*!40000 ALTER TABLE `t_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_users`
--

DROP TABLE IF EXISTS `t_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) NOT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `question` varchar(100) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `qq` varchar(11) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `nickname` (`nickname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_users`
--

LOCK TABLES `t_users` WRITE;
/*!40000 ALTER TABLE `t_users` DISABLE KEYS */;
INSERT INTO `t_users` VALUES (1,'sol','suo','754543850@qq.com','123456',NULL,NULL,NULL,NULL,NULL,'754543850',NULL),(2,'鹏哥','彭潇鹏','sb@sb.com','1234566',NULL,NULL,'',NULL,NULL,NULL,NULL),(3,'张三','张三','zhangsan@163.com','123123',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'qq','qqq','qwweqe','qweqwe',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'qq1w','qqq','qwweqeqewq','qqq',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'小米','qqq2','qwweqdsaeqewq','111',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'小东',NULL,'xiaodong@sb.com','123123',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'小东2',NULL,'xiaodong2@sb.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'小明',NULL,'xiaoming@163.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'aaa',NULL,'aaa','aaa',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'',NULL,'','',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-31 15:39:01
