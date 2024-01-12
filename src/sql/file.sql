CREATE TABLE `file` (
        `id` INT NOT NULL AUTO_INCREMENT,
        `show_id` INT NOT NULL COMMENT '전시회ID',
        `file_name` VARCHAR(255) DEFAULT NULL COMMENT '파일명',
        `encode_name` VARCHAR(255) NOT NULL COMMENT '파일 인코딩',
        `ext`VARCHAR(45) NOT NULL COMMENT '파일 확장자',
        `file_size` INT NOT NULL COMMENT '파일 사이즈',
        `is_temp` INT DEFAULT NULL COMMENT '임시파일 여부',
        `member_id` INT NOT NULL COMMENT '등록 유저ID',
        `delete_user_id` INT DEFAULT NULL COMMENT '삭제 유저ID',
        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일자',
        `deleted_at` DATETIME DEFAULT NULL COMMENT '삭제일자',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원정보';
