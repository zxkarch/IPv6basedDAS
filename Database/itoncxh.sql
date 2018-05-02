/*

Source Server         : Database
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : itoncxh

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2017-12-28 11:09:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `current_record`
-- ----------------------------
DROP TABLE IF EXISTS `current_record`;
CREATE TABLE `current_record` (
  `user_id` int(11) NOT NULL,
  `count_break` int(11) NOT NULL,
  `count_start` int(11) NOT NULL,
  `count_turn` int(11) NOT NULL,
  `count_overtake` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `high_speed` float NOT NULL,
  `distance` float NOT NULL,
  `drive_time` int(11) NOT NULL,
  `jam` int(11) NOT NULL,
  `cur_date` datetime NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `login_info`
-- ----------------------------
DROP TABLE IF EXISTS `login_info`;
CREATE TABLE `login_info` (
  `user_id` int(11) NOT NULL auto_increment,
  `phone` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `device_id` varchar(255) NOT NULL,
  `device_type` varchar(255) NOT NULL,
  `cur_date` datetime NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `user_id` int(11) NOT NULL,
  `count_break` int(11) NOT NULL,
  `count_start` int(11) NOT NULL,
  `count_turn` int(11) NOT NULL,
  `count_overtake` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `high_speed` float NOT NULL,
  `distance` float NOT NULL,
  `drive_time` int(11) NOT NULL,
  `jam` int(11) NOT NULL,
  `cur_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL,
  `nick_name` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  `license_date` date default NULL,
  `img` varchar(255) default NULL,
  `cur_date` datetime NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `user_summary`
-- ----------------------------
DROP TABLE IF EXISTS `user_summary`;
CREATE TABLE `user_summary` (
  `user_id` int(11) NOT NULL,
  `accumulate` int(11) NOT NULL,
  `drive_count` int(11) NOT NULL,
  `avg_score` int(11) NOT NULL,
  `cur_date` datetime NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
