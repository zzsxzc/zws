/*
Navicat MySQL Data Transfer

Source Server         : mysql-local
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : zws

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-03-08 11:06:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for freedommxc_product
-- ----------------------------
DROP TABLE IF EXISTS `freedommxc_product`;
CREATE TABLE `freedommxc_product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `kind` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `isOpenSource` int DEFAULT NULL,
  `isShow` int DEFAULT NULL,
  `version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '版本号',
  `downloudCount` int DEFAULT NULL,
  `isNeedDownload` int DEFAULT NULL,
  `shorDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `imageUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `appUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `onlineDesUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of freedommxc_product
-- ----------------------------
INSERT INTO `freedommxc_product` VALUES ('1', 'webapp1', 'webapp', null, '1', null, null, null, null, 'desurl/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('2', 'webapp2', 'webapp', null, '1', null, null, null, null, 'desurl/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('3', 'app1', 'app', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('4', 'app2', 'app', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('5', 'pc1', 'pc', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('6', 'pc2', 'pc', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('7', 'wechat1', 'wechat', null, '1', null, null, null, null, 'desurl/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('8', 'wechat2', 'wechat', null, '1', null, null, null, null, 'desurl/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('9', 'game1', 'game', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES ('10', 'game2', 'game', null, '1', null, null, null, null, 'desurl/test.png', '/apppackageurl/app.zip', 'https://github.com/zzsxzc');

-- ----------------------------
-- Table structure for zadminiistrators
-- ----------------------------
DROP TABLE IF EXISTS `zadminiistrators`;
CREATE TABLE `zadminiistrators` (
  `zid` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `zname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `zpassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `zcreatedate` datetime NOT NULL COMMENT '创建日期',
  `zchangedate` datetime NOT NULL COMMENT '更新如期',
  `zrole` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'level3' COMMENT '角色',
  PRIMARY KEY (`zid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of zadminiistrators
-- ----------------------------
INSERT INTO `zadminiistrators` VALUES ('1', 'zzsxzc', '12345678', '2020-12-28 19:48:38', '2020-12-28 19:48:38', 'leveltop');
