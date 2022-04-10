package com.cognizant.retailbank.apigateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.retailbank.apigateway.dto.AuthServiceDto;
import com.cognizant.retailbank.apigateway.utils.RoleUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VerificationService {

	private final static String AUTHURL = "http://localhost:8084/auth-ms/validateToken";

	@Autowired
	RestTemplate restTemplate;

	public boolean verifyService(String token,String uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", token);
		ResponseEntity<AuthServiceDto> authResponse=null;
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		try {
			authResponse = restTemplate.exchange(AUTHURL, HttpMethod.GET, requestEntity,
					AuthServiceDto.class);
		}
		catch(Exception e) {
			
			return false;
		}
		log.info("Response {}",authResponse);

		if(authResponse.getStatusCode().is2xxSuccessful()) {
			if(authResponse.getBody().isValid()) {
				String role=authResponse.getBody().getRole();
				boolean authorized=RoleUtil.getRoles().get(role).stream().anyMatch(r ->{
					log.info("path {}",r);
					log.info("uri {}",uri);
					return uri.contains(r);
					});
				return authorized;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
}
