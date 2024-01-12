CREATE TABLE `notify` (
        `id` INT NOT NULL AUTO_INCREMENT,
        `show_id` INT NOT NULL COMMENT '전시회ID',
        `member_id` INT NOT NULL COMMENT '받는 유저ID',
        `msg` varchar(255) NOT NULL COMMENT '메세지 내용',
        `link_url` VARCHAR(255) DEFAULT NULL COMMENT '링크URL',
        `is_read` varchar(45) default null comment '읽음 여부',
        `is_push` int default null comment '푸쉬여부',
        `res` int default '0' comment '푸쉬 성공여부 : 성공시 1',
        `send_at` DATETIME DEFAULT NULL COMMENT '발송일자',
        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일자',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원정보';
