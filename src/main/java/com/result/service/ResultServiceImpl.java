package com.result.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.result.entity.ResultEntity;
import com.result.entity.UserResultBo;
import com.result.repository.ResultRepository;

@Service
public class ResultServiceImpl {
	@Autowired
	ResultRepository resultRepository;

	public UserResultBo getByEmailAndTestSeries(String email, String testSeries) {

		final String uri = "http://localhost:7878/api/v1/userByEmail/" + email;
		ResultEntity resultEntity = resultRepository.getResultByEmailAndTestSeries(email,testSeries);

		RestTemplate restTemplate = new RestTemplate();
		UserResultBo userResultBo = restTemplate.getForObject(uri, UserResultBo.class);
		userResultBo.setResultEntity(resultEntity);
		return userResultBo;
	}


}
