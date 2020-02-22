package com.user.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.result.dto.UserResultDto;
import com.user.result.entity.UserResultEntity;
import com.user.result.service.UserResultService;

@RestController
@RequestMapping("userResultApi/v1")
public class UserResultController
{
	@Autowired
	UserResultService userResultService;

	@GetMapping("result/{email}")
	public ResponseEntity<List<UserResultEntity>> getUserResultBy(
		@PathVariable("email") String email)
	{
		return ResponseEntity.ok().body(userResultService.getByEmail(email));
	}

	@PostMapping("submit")
	public void submit(@RequestBody UserResultEntity resultEntity)
	{
		userResultService.submit(resultEntity);
	}
	@GetMapping("result/{email}/{testSeries}")
	public ResponseEntity<UserResultDto> getUserResult(
		@PathVariable("email") String email,
		@PathVariable("testSeries") String testSeries)
	{
		return ResponseEntity.ok()
			.body(userResultService.getUserResult(email, testSeries));
	}

}
