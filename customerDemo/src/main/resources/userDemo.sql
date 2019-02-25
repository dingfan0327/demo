/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : ssm_01

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 05/10/2018 21:35:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(100) DEFAULT NULL,
  `c_telephone` varchar(100) DEFAULT NULL,
  `c_address` varchar(100) DEFAULT NULL,
  `c_remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
BEGIN;
INSERT INTO `customer` VALUES (1, '涂陌', '123456789', '你猜', '不想写备注');
INSERT INTO `customer` VALUES (2, '逗瓜', '123456789', '你猜', '不想写备注');
INSERT INTO `customer` VALUES (3, '愤青', '123456789', '你猜', '不想写备注');
INSERT INTO `customer` VALUES (4, '咸鱼', '123456789', '你猜', '不想写备注');
INSERT INTO `customer` VALUES (5, '小白', '123456789', '你猜', '不想写备注');
INSERT INTO `customer` VALUES (26, 'sss', 'qq', 'qq', 'qq');
INSERT INTO `customer` VALUES (27, 'qwe', 'qq', 'qq', 'qq');
INSERT INTO `customer` VALUES (28, 'dfg', 'dfgd ', ' sfsdf', 'sdfsdf');
INSERT INTO `customer` VALUES (29, 'czxasdew', 'qwe', 'asd ', 'asd');
INSERT INTO `customer` VALUES (30, '大多数撒', '123', '阿萨德', '阿瑟');
INSERT INTO `customer` VALUES (31, '阿萨德', '阿萨德', '阿萨德', '213 ');
INSERT INTO `customer` VALUES (32, '发过火', '阿萨德', '阿萨德', '213 ');
INSERT INTO `customer` VALUES (33, '我去额', '阿萨德', '阿萨德', '213 ');
INSERT INTO `customer` VALUES (34, '去', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (35, '我', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (36, '我额', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (37, '人额', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (38, '通过', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (39, 'qwe', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (40, '用户', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (41, '通过', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (42, '不过', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (43, '成都', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (44, '用户人', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (45, '空的', '111111', '阿萨德', '阿萨德');
INSERT INTO `customer` VALUES (46, '热热热', '666', '广泛覆盖', '人头狗');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'admin', 'admin');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
