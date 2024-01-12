package com.example.exhibition.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MemberConfig {

		// RestTemplate 사용하기 위해 Bean 등록 설정
		@Bean
		public RestTemplate restTemplate() {
				return new RestTemplate();
		}

}
