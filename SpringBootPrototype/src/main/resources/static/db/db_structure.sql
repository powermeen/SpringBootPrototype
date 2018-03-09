--
-- Table structure for table `role`
--
DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `i_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`i_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `i_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_active` int(11) DEFAULT NULL,
  `c_email` varchar(255) NOT NULL,
  `c_last_name` varchar(255) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_password` varchar(255) NOT NULL,
  PRIMARY KEY (`i_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `i_user_id` int(11) NOT NULL,
  `i_role_id` int(11) NOT NULL,
  PRIMARY KEY (`i_user_id`,`i_role_id`),
  KEY `key_role_id` (`i_role_id`),
  CONSTRAINT `FK_user_id` FOREIGN KEY (`i_user_id`) REFERENCES `user` (`i_user_id`),
  CONSTRAINT `FK_role_id` FOREIGN KEY (`i_role_id`) REFERENCES `role` (`i_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

