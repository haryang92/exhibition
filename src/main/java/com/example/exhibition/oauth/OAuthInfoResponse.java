package com.example.exhibition.oauth;

// 회원 정보 API 응답 (인터페이스)
public interface OAuthInfoResponse {

		String getName();
		String getEmail();
		String getnickname();
		OAuthProvider getOAuthProvider();
		String getmobile();

}
