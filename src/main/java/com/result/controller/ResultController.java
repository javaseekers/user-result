package com.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.UserResultBo;
import com.result.service.ResultServiceImpl;

@RestController
@RequestMapping("result/v1")
public class ResultController {
	@Autowired
	ResultServiceImpl resultServiceImpl;

	@GetMapping("{email}/{testSeries}")
	public ResponseEntity<UserResultBo> getByEmail(@PathVariable String email,@PathVariable String testSeries) {

		return ResponseEntity.ok().body(resultServiceImpl.getByEmailAndTestSeries(email,testSeries));

	}
}
