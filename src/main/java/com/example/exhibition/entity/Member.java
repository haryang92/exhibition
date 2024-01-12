package com.example.exhibition.entity;

import com.example.exhibition.oauth.OAuthProvider;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Member {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;                        // pk
		private String email;                   // 이메일
		private String pw;                      // 비밀번호
		private String name;                    // 이름
		private String nickname;                // 별명
		private String mobile;                  // 휴대폰번호
		private OAuthProvider oAuthProvider;    // sns종류
		private LocalDateTime createdAt;        // 가입일
		private LocalDateTime deletedAt;        // 탈퇴일

		@Builder
		public Member(String email, String pw, String name, String nickname, String mobile, OAuthProvider oAuthProvider) {
			this.email = email;
			this.pw = pw;
			this.name = name;
			this.nickname = nickname;
			this.mobile = mobile;
			this.oAuthProvider = oAuthProvider;
		}
		
}
