package com.result.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.result.dto.UserResultDTO;
import com.result.entity.ResultEntity;
import com.result.repository.ResultRepository;

@Service
public class ResultServiceImpl {
	@Autowired
	ResultRepository resultRepository;
	@Value("${usermanager.uri}")
	String uri;
	
	public UserResultDTO getByEmailAndTestSeries(String email, String testSeries) {
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@    "+uri);
		ResultEntity resultEntity = resultRepository.getResultByEmailAndTestSeries(email,testSeries);

		RestTemplate restTemplate = new RestTemplate();
		UserResultDTO userResultDTO = restTemplate.getForObject(uri+email, UserResultDTO.class);
		userResultDTO.setResultEntity(resultEntity);
		return userResultDTO;
	}


}
