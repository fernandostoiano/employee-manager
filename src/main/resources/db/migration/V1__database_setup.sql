DROP SCHEMA IF EXISTS `employee_manager`;
CREATE SCHEMA `employee_manager` COLLATE utf8_general_ci;

CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
)DEFAULT CHARSET=utf8;

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `department_id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_employee_department_id` (`department_id`),
  CONSTRAINT `FK_employee_department_id` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
)DEFAULT CHARSET=utf8;