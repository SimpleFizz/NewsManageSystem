/*
SQLyog Ultimate v11.26 (32 bit)
MySQL - 5.5.28 : Database - news
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`news` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `news`;

/*Table structure for table `anthorty_info` */

DROP TABLE IF EXISTS `anthorty_info`;

CREATE TABLE `anthorty_info` (
  `anthorty_id` int(11) NOT NULL AUTO_INCREMENT,
  `anthorty_pid` int(11) DEFAULT NULL,
  `anthorty_name` varchar(30) DEFAULT NULL,
  `anthorty_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`anthorty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `anthorty_info` */

insert  into `anthorty_info`(`anthorty_id`,`anthorty_pid`,`anthorty_name`,`anthorty_url`) values (1,-1,'跟目录',NULL),(2,1,'用户管理',NULL),(3,1,'新闻管理',NULL),(4,3,'新闻列表',NULL),(5,3,'发布新闻',NULL),(6,3,'审核新闻',NULL),(7,2,'用户管理',NULL);

/*Table structure for table `news_info` */

DROP TABLE IF EXISTS `news_info`;

CREATE TABLE `news_info` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_title` varchar(100) DEFAULT NULL,
  `news_author` varchar(100) DEFAULT NULL,
  `news_time` date DEFAULT NULL,
  `news_address` varchar(200) DEFAULT NULL,
  `news_status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `news_info` */

insert  into `news_info`(`news_id`,`news_title`,`news_author`,`news_time`,`news_address`,`news_status`) values (1,'如何成长','鞠萍姐姐','2010-07-15',NULL,'审核通过'),(3,'篮球奥义','科比','2018-09-12',NULL,'审核通过'),(4,'足球详解','李毅','2018-09-03',NULL,'未审核'),(5,'java详解','马化腾','2018-09-04',NULL,'未通过'),(6,'安徽科技','王伟','2018-09-06',NULL,'未通过'),(7,'时代大王','李伟','2018-09-04',NULL,'审核通过'),(8,'计算机工程科学 ','马俊','2018-09-06',NULL,'审核通过'),(9,'计算机教育','刘二','2018-10-19',NULL,'审核通过'),(10,'互联网道路','雨薇','2018-09-13',NULL,'未通过'),(11,'微电子 ','拉卡多','2018-09-06',NULL,'未通过'),(12,'软件工程','发拉西','2018-09-23',NULL,'未通过'),(13,'漫雾小镇','王赛','2018-09-08',NULL,'未通过'),(14,'我给女儿的信','马赛克','2018-09-14',NULL,'审核通过'),(15,'简单禅意','周游','2018-09-03',NULL,'审核通过'),(16,'天空','黄文','2018-10-07',NULL,'未通过'),(17,'你以为的沟通','吕文娜','2018-08-27',NULL,'未通过'),(18,'是你的孩子','文小计','2018-08-30',NULL,'未通过'),(19,'冰清玉洁计量sb','无敌哥','2018-08-29',NULL,'审核通过'),(20,'你懂个屁','校长','2018-10-05',NULL,'未通过'),(21,'学会拒绝','直男哦','2018-09-19',NULL,'未通过'),(22,'自暴自弃','于格河','2018-10-05',NULL,'审核通过'),(23,'自身自灭','香格拉','2018-10-07',NULL,'审核通过'),(24,'除了自己','逆势','2018-09-21',NULL,'未通过'),(25,'相信你才怪','shisdf','2018-09-15',NULL,'审核通过'),(26,'hello nimeimei','salahei','2018-09-08',NULL,'审核通过'),(27,'一碗捞面条','张三丰','2018-09-18',NULL,'审核通过'),(28,'我是睿智吗','菜一啊','2018-09-28',NULL,'未通过'),(29,'烟消云散','王一博','2018-09-29',NULL,'审核通过'),(30,'遇见','阿妹啊','2018-10-03',NULL,'未通过');

/*Table structure for table `role_anthority_info` */

DROP TABLE IF EXISTS `role_anthority_info`;

CREATE TABLE `role_anthority_info` (
  `role_anthorty_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `anthorty_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`role_anthorty_id`),
  KEY `role_id` (`role_id`),
  KEY `anthorty_id` (`anthorty_id`),
  CONSTRAINT `role_anthority_info_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`),
  CONSTRAINT `role_anthority_info_ibfk_2` FOREIGN KEY (`anthorty_id`) REFERENCES `anthorty_info` (`anthorty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `role_anthority_info` */

insert  into `role_anthority_info`(`role_anthorty_id`,`role_id`,`anthorty_id`) values (1,1,2),(2,1,3),(3,1,4),(4,1,5),(5,1,6),(6,2,3),(7,2,4),(8,2,5),(9,1,7);

/*Table structure for table `role_info` */

DROP TABLE IF EXISTS `role_info`;

CREATE TABLE `role_info` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `role_info` */

insert  into `role_info`(`role_id`,`role_name`) values (1,'管理员'),(2,'用户');

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL,
  `user_address` varchar(100) DEFAULT NULL,
  `user_sex` varchar(30) DEFAULT NULL,
  `user_number` varchar(30) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_info_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`user_id`,`role_id`,`user_name`,`user_age`,`user_address`,`user_sex`,`user_number`,`user_password`) values (1,1,'张三',40,'浙江温州','男','abcd','abcd'),(2,2,'李四',20,'浙江杭州','南','1234','1234'),(3,2,'姜红',20,'浙江宁波','女','12345','12345'),(4,2,'王猛',22,'浙江金华','男','456123','456123'),(5,2,'常远',23,'浙江丽水','男','789456','789456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
