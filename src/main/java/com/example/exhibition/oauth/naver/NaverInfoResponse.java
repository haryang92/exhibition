package com.example.exhibition.oauth.naver;

import com.example.exhibition.oauth.OAuthInfoResponse;
import com.example.exhibition.oauth.OAuthProvider;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NaverInfoResponse implements OAuthInfoResponse {

		@JsonProperty("response")
		private Response response;

		@Getter
		@JsonIgnoreProperties(ignoreUnknown = true) // 필요 없는 값들은 제외하고 원하는 값만 받도록 하기
		static class Response {
				private String email;
				private String name;
				private String nickname;
				private String mobile;
		}

		@Override
		public String getName() {
				return response.getName();
		}

		@Override
		public String getEmail() {
				return response.getEmail();
		}

		@Override
		public String getnickname() {
				return response.getNickname();
		}

		@Override
		public OAuthProvider getOAuthProvider() {
				return OAuthProvider.NAVER;
		}

		@Override
		public String getmobile() {
				return response.getMobile();
		}

}
