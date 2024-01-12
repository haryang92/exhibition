CREATE TABLE `members` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `email` varchar(255) NOT NULL COMMENT '이메일',
        `pw` varchar(255) NOT NULL COMMENT '비밀번호',
        `name` varchar(255) NOT NULL COMMENT '이름',
        `nickname` VARCHAR(50) DEFAULT NULL COMMENT '별명',
        `phone_number` VARCHAR(11) DEFAULT NULL COMMENT '연락처',
        `authentication_token` varchar(255) NOT NULL COMMENT '인증 토근 정보(oAuth2)',
        `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '가입일자',
        `deleted_at` datetime DEFAULT NULL COMMENT '탈퇴일자',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원정보';
