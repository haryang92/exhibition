package com.example.exhibition.oauth;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 외부 API 요청의 중복되는 로직을 공통화한 클래스
@Component
public class RequestOauthInfoService {
		private final Map<OAuthProvider, OauthApiClient> clients;

		public RequestOauthInfoService(List<OauthApiClient> clients) {
				this.clients = clients.stream().collect(
								Collectors.toUnmodifiableMap(OauthApiClient::oAuthProvider, Function.identity())
				);
		}

		public OAuthInfoResponse request(OAuthLoginParams params) {
				OauthApiClient client = clients.get(params.oAuthProvider());
				String accessToken = client.requestAccessToken(params);
				return client.requestOauthInfo(accessToken);
		}
}
