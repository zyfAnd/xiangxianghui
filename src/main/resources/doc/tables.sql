use xiangxianghui;
CREATE TABLE `xiangxianghui`.`t_activity` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `content` VARCHAR(200) NULL,
  `image` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `xiangxianghui`.`t_car` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `content` VARCHAR(200) NULL,
  `image` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));




CREATE TABLE `xiangxianghui`.`t_law` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `content` VARCHAR(200) NULL,
  `image` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `xiangxianghui`.`t_investment` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `content` VARCHAR(200) NULL,
  `image` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `xiangxianghui`.`t_charity` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `content` VARCHAR(200) NULL,
  `image` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));
