package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.ResultEntity;
import com.result.service.ResultServiceImpl;

@RestController
@RequestMapping("result/v1")
public class ResultController {
	@Autowired
	ResultServiceImpl resultServiceImpl;

	@GetMapping("{email}")
	public ResponseEntity<ResultEntity> getByEmail(@PathVariable String email) {

		return ResponseEntity.ok().body(resultServiceImpl.getByEmail(email));

	}
}
