package com.example.exhibition.oauth.naver;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NaverTokens {
// 인증 API 응답
// Authorization Code를 기반으로 타플랫폼 Access Token을 받아오기 위한 Response Model 입니다.
// https://developers.naver.com/docs/login/api/api.md#4-2--%EC%A0%91%EA%B7%BC-%ED%86%A0%ED%81%B0-%EB%B0%9C%EA%B8%89-%EC%9A%94%EC%B2%AD 참고

		@JsonProperty("access_token")
		private String accessToken;

		@JsonProperty("refresh_token")
		private String refreshToken;

		@JsonProperty("token_type")
		private String tokenType;

		@JsonProperty("expires_in")
		private String expiresIn;

}
