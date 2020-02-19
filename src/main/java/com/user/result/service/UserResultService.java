package com.user.result.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.result.entity.UserResultBo;
import com.user.result.entity.UserResultEntity;
import com.user.result.repo.UserResultRepository;

@Service
public class UserResultService
{
	@Autowired
	UserResultRepository userResultRepository;

	@Autowired
	RestTemplate restTemplate;

	public List<UserResultEntity> getByEmail(String email)
	{
		return userResultRepository.getByEmail(email);
	}

	public void submit(UserResultEntity resultEntity)
	{
		userResultRepository.save(resultEntity);
	}
	public UserResultBo getUserResult(String email, String testSeries)
	{
		UserResultEntity userResultEntity = userResultRepository
			.getByEmailAndTestSeries(email, testSeries);
		
		
		UserResultBo userResultBo = restTemplate.getForObject(
			"http://localhost:2022/userApi/users/" + email,
			UserResultBo.class);
		
		
		userResultBo.setUserResultEntity(userResultEntity);

		return userResultBo;
	}
}
