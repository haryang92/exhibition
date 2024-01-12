CREATE TABLE `show` (
        `id` INT NOT NULL AUTO_INCREMENT,
        `title` VARCHAR(100) NOT NULL COMMENT '제목',
        `contents` LONGTEXT NOT NULL COMMENT '내용',
        `show_date` DATE NOT NULL COMMENT '전시회일정',
        `opening_hours` VARCHAR(500) DEFAULT NULL COMMENT '영업일',
        `address` VARCHAR(200) DEFAULT NULL COMMENT '주소',
        `number` VARCHAR(12) DEFAULT NULL COMMENT '전화 번호',
        `fee` INT DEFAULT NULL COMMENT '입장료',
        `tag` VARCHAR(1000) DEFAULT NULL COMMENT '태그',
        `like` INT DEFAULT NULL COMMENT '좋아요',
        `file_id` INT NULL COMMENT '파일ID',
        `member_id` INT NOT NULL COMMENT '등록 유저ID',
        `delete_user_id` INT DEFAULT NULL COMMENT '삭제 유저ID',
        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일자',
        `updated_at` DATETIME DEFAULT NULL COMMENT '수정일자',
        `deleted_at` DATETIME DEFAULT NULL COMMENT '삭제일자',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원정보';
