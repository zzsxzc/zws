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

 Date: 04/03/2021 21:10:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
INSERT INTO `zadminiistrators` VALUES (1, 'zzsxzc', 'beijingzzs2014@', '2020-12-28 19:48:38', '2020-12-28 19:48:38', 'leveltop');

SET FOREIGN_KEY_CHECKS = 1;
