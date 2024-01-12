package com.example.exhibition.service;

import com.example.exhibition.entity.Member;
import com.example.exhibition.jwt.AuthTokens;
import com.example.exhibition.jwt.AuthTokensGenerator;
import com.example.exhibition.oauth.OAuthInfoResponse;
import com.example.exhibition.oauth.OAuthLoginParams;
import com.example.exhibition.oauth.RequestOauthInfoService;
import com.example.exhibition.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OAuthLoginService {

		private final MemberRepository memberRepository;
		private final AuthTokensGenerator authTokensGenerator;
		private final RequestOauthInfoService requestOAuthInfoService;

		public AuthTokens login(OAuthLoginParams params) {
				OAuthInfoResponse oAuthInfoResponse = requestOAuthInfoService.request(params);
				Long memberId = findOrCreateMember(oAuthInfoResponse);
				return authTokensGenerator.generate(memberId);
		}

		private Long findOrCreateMember(OAuthInfoResponse oAuthInfoResponse) {
				return memberRepository.findByEmail(oAuthInfoResponse.getEmail())
								.map(Member::getId)
								.orElseGet(() -> newMember(oAuthInfoResponse));
		}

		private Long newMember(OAuthInfoResponse oAuthInfoResponse) {
				Member member = Member.builder()
								.email(oAuthInfoResponse.getEmail())
								.name(oAuthInfoResponse.getName())
								.nickname(oAuthInfoResponse.getnickname())
								.oAuthProvider(oAuthInfoResponse.getOAuthProvider())
								.mobile(oAuthInfoResponse.getmobile())
								.build();

				return memberRepository.save(member).getId();
		}

}
