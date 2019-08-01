package com.cafe24.api.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.api.dto.ScriptTagPostDto;
import com.cafe24.api.dto.ScriptTagResult;
import com.cafe24.api.service.ApiService;

@RestController("ApiController")
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ApiService apiService;
	
	@GetMapping("/scripttag")
	public ResponseEntity<ScriptTagResult> getScriptTags() throws URISyntaxException {
		return ResponseEntity.status(HttpStatus.OK).body(apiService.getScriptTags());
	}
	
	@PostMapping("/scripttag")
	public  ResponseEntity<String> createScriptTags(@RequestBody ScriptTagPostDto scriptTagPostDto) throws URISyntaxException {
		return apiService.postScriptTags(scriptTagPostDto);
	}
	
	@DeleteMapping("/scripttag/{no}")
	public ResponseEntity<String> DeleteScriptTags(@PathVariable(value = "no")Long deleteNo) throws URISyntaxException {
		return apiService.deleteScriptTags(deleteNo);
	}
	
	
}
