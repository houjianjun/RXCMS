/*
Navicat MySQL Data Transfer

Source Server         : MYSQL5.7.17
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : rxcmsdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-14 15:17:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `FB_Id` int(11) NOT NULL AUTO_INCREMENT,
  `FB_Title` varchar(50) DEFAULT NULL,
  `FB_Context` text,
  `FB_Time` datetime DEFAULT NULL,
  `FB_IsHandle` int(11) DEFAULT NULL,
  PRIMARY KEY (`FB_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------

-- ----------------------------
-- Table structure for files
-- ----------------------------
DROP TABLE IF EXISTS `files`;
CREATE TABLE `files` (
  `F_Id` int(11) NOT NULL AUTO_INCREMENT,
  `F_Title` varchar(50) DEFAULT NULL,
  `F_Type` varchar(255) DEFAULT NULL,
  `F_Src` varchar(100) DEFAULT NULL,
  `F_Desc` text,
  `F_Time` datetime DEFAULT NULL,
  `F_Count` int(11) DEFAULT NULL,
  PRIMARY KEY (`F_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of files
-- ----------------------------

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `M_Id` int(11) NOT NULL AUTO_INCREMENT,
  `M_Name` varchar(50) DEFAULT NULL,
  `M_PWD` varchar(50) DEFAULT NULL,
  `M_LoginTime` datetime DEFAULT NULL,
  `M_LoginNum` int(11) DEFAULT NULL,
  `M_IsSuper` int(11) DEFAULT NULL,
  PRIMARY KEY (`M_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', 'zhangsan', '123456', null, null, null);
INSERT INTO `manager` VALUES ('4', 'lisi', 'e10adc3949ba59abbe56e057f20f883e', null, null, null);
INSERT INTO `manager` VALUES ('5', 'zhangsan', 'e10adc3949ba59abbe56e057f20f883e', null, null, null);
INSERT INTO `manager` VALUES ('13', '1', 'c4ca4238a0b923820dcc509a6f75849b', null, null, null);

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `N_Id` int(11) NOT NULL AUTO_INCREMENT,
  `N_Title` varchar(50) DEFAULT NULL,
  `N_Author` varchar(50) DEFAULT NULL,
  `N_Time` datetime DEFAULT NULL,
  `N_Context` text,
  `N_Count` int(11) DEFAULT NULL,
  PRIMARY KEY (`N_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '不错的选择', null, null, null, null);

-- ----------------------------
-- Table structure for newsclass
-- ----------------------------
DROP TABLE IF EXISTS `newsclass`;
CREATE TABLE `newsclass` (
  `NS_Id` int(11) NOT NULL AUTO_INCREMENT,
  `NS_Name` varchar(50) DEFAULT NULL,
  `NS_Desc` text,
  PRIMARY KEY (`NS_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newsclass
-- ----------------------------
INSERT INTO `newsclass` VALUES ('1', '公司简介', null);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `P_Id` int(11) NOT NULL AUTO_INCREMENT,
  `P_Name` varchar(50) DEFAULT NULL,
  `P_Des` text,
  `P_Num` int(11) DEFAULT NULL,
  `P_Class` varchar(50) DEFAULT NULL,
  `P_Datetime` datetime DEFAULT NULL,
  `P_price` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`P_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', 'arduino', null, null, null, null, null);

-- ----------------------------
-- Table structure for productclass
-- ----------------------------
DROP TABLE IF EXISTS `productclass`;
CREATE TABLE `productclass` (
  `PC_Id` int(11) NOT NULL AUTO_INCREMENT,
  `PC_Name` varchar(50) DEFAULT NULL,
  `PC_Des` text,
  `P_ParentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`PC_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productclass
-- ----------------------------
INSERT INTO `productclass` VALUES ('1', '开发板', null, null);

-- ----------------------------
-- Table structure for sysconfig
-- ----------------------------
DROP TABLE IF EXISTS `sysconfig`;
CREATE TABLE `sysconfig` (
  `SC_Id` int(11) NOT NULL AUTO_INCREMENT,
  `SC_Title` varchar(50) DEFAULT NULL,
  `SC_Context` text,
  `SC_Time` datetime DEFAULT NULL,
  `SC_IsHandle` int(11) DEFAULT NULL,
  PRIMARY KEY (`SC_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysconfig
-- ----------------------------
INSERT INTO `sysconfig` VALUES ('1', 'test', null, null, null);
