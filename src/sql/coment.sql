CREATE TABLE `comment` (
        `id` INT NOT NULL AUTO_INCREMENT,
        `show_id` INT NOT NULL COMMENT '전시회ID',
        `parent_id` INT NOT NULL COMMENT '상위 댓글ID',
        `contents` varchar(500) NOT NULL COMMENT '내용',
        `member_id` INT NOT NULL COMMENT '등록 유저ID',
        `delete_user_id` INT DEFAULT NULL COMMENT '삭제 유저ID',
        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일자',
        `updated_at` DATETIME DEFAULT NULL COMMENT '수정일자',
        `deleted_at` DATETIME DEFAULT NULL COMMENT '삭제일자',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원정보';
