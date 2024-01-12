package com.example.exhibition.controller;

import com.example.exhibition.jwt.AuthTokens;
import com.example.exhibition.oauth.naver.NaverLoginParams;
import com.example.exhibition.service.OAuthLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
		private final OAuthLoginService oAuthLoginService;

		@PostMapping("/naver")
		public ResponseEntity<AuthTokens> loginNaver(@RequestBody NaverLoginParams params) {
				return ResponseEntity.ok(oAuthLoginService.login(params));
		}
}
