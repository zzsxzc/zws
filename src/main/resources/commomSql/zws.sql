/*
 Navicat Premium Data Transfer

 Source Server         : local-mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : zws

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 07/03/2021 17:41:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for freedommxc_product
-- ----------------------------
DROP TABLE IF EXISTS `freedommxc_product`;
CREATE TABLE `freedommxc_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `kind` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `isOpenSource` int(1) NULL DEFAULT NULL,
  `isShow` int(1) NULL DEFAULT NULL,
  `version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '版本号',
  `downloudCount` int(11) NULL DEFAULT NULL,
  `isNeedDownload` int(1) NULL DEFAULT NULL,
  `shorDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `imageUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `appUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `onlineDesUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of freedommxc_product
-- ----------------------------
INSERT INTO `freedommxc_product` VALUES (1, 'webapp1', 'webapp', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (2, 'webapp2', 'webapp', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (3, 'app1', 'app', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (4, 'app2', 'app', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (5, 'pc1', 'pc', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (6, 'pc2', 'pc', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (7, 'wechat1', 'wechat', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (8, 'wechat2', 'wechat', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (9, 'game1', 'game', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');
INSERT INTO `freedommxc_product` VALUES (10, 'game2', 'game', NULL, 1, NULL, NULL, NULL, NULL, 'image/test.png', 'https://github.com/zzsxzc', 'https://github.com/zzsxzc');

-- ----------------------------
-- Table structure for zadminiistrators
-- ----------------------------
DROP TABLE IF EXISTS `zadminiistrators`;
CREATE TABLE `zadminiistrators`  (
  `zid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `zname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `zpassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `zcreatedate` datetime(0) NOT NULL COMMENT '创建日期',
  `zchangedate` datetime(0) NOT NULL COMMENT '更新如期',
  `zrole` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'level3' COMMENT '角色',
  PRIMARY KEY (`zid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zadminiistrators
-- ----------------------------
INSERT INTO `zadminiistrators` VALUES (1, 'zzsxzc', '12345678', '2020-12-28 19:48:38', '2020-12-28 19:48:38', 'leveltop');

SET FOREIGN_KEY_CHECKS = 1;
