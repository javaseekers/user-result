package com.result.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.entity.ResultEntity;
import com.result.repository.ResultRepository;

@Service
public class ResultServiceImpl {
	@Autowired
	ResultRepository resultRepository;

	public ResultEntity getByEmail(String email) {
		return resultRepository.getResultByEmail(email);
	}


}
