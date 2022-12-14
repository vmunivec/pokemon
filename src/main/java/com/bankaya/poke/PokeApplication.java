package com.bankaya.poke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class PokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeApplication.class, args);
	}

	@Value("${api.host.baseurl}")
	private String apiHost;

	@Bean
	public RestTemplate restTemplate() {

		var factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(3000);
		factory.setReadTimeout(3000);
		RestTemplate restTemplate = new RestTemplate(factory);
		restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(apiHost));
		return restTemplate;
	}

}
