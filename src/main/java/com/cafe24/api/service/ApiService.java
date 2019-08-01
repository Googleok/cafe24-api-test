package com.cafe24.api.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cafe24.api.dto.ScriptTagPostDto;
import com.cafe24.api.dto.ScriptTagResult;



@Service
public class ApiService {
	final String baseUrl = "https://whddjr2225.cafe24api.com/api/v2/admin/scripttags";
	
	public HttpHeaders setUpHeader() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("authorization", "Bearer iwYGGboOKZNjZYsh6om1CA");
		headers.add("content-type", "application/json");
		return headers;
	}
	
	public ScriptTagResult getScriptTags() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = new URI(baseUrl);
		HttpHeaders headers = setUpHeader();
	
		HttpEntity<ScriptTagResult> requestEntity = new HttpEntity<ScriptTagResult>(headers);
		
		ResponseEntity<ScriptTagResult> result = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, ScriptTagResult.class);
		System.out.println(result.getBody());
		return result.getBody();
	}

	public ResponseEntity<String> postScriptTags(ScriptTagPostDto scriptTagPostDto) throws URISyntaxException {
		
		RestTemplate restTemplate = new RestTemplate();
		URI uri = new URI(baseUrl);
		HttpHeaders headers = setUpHeader();
		
		HttpEntity<ScriptTagPostDto> requestEntity = new HttpEntity<ScriptTagPostDto>(scriptTagPostDto, headers);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, String.class);
		return result;
	}

	public ResponseEntity<String> deleteScriptTags(Long deleteNo) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = new URI(baseUrl);
		HttpHeaders headers = setUpHeader();
		
		HttpEntity<String> requestEntity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> result = restTemplate.exchange(uri+"/"+deleteNo.toString(), HttpMethod.DELETE, requestEntity, String.class);
		return result;
	}

	
	
}
