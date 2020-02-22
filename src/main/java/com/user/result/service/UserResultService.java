package com.user.result.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.result.dto.UserResultDto;
import com.user.result.entity.UserResultEntity;
import com.user.result.repo.UserResultRepository;

@Service
@PropertySource("classpath:/urlinfo.properties")
public class UserResultService
{
	@Autowired
	Environment env;
	
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
	public UserResultDto getUserResult(String email, String testSeries)
	{
		UserResultEntity userResultEntity = userResultRepository
			.getByEmailAndTestSeries(email, testSeries);
		
		UserResultDto userResultBo = restTemplate.getForObject(
			env.getProperty("user-manager") + email, UserResultDto.class);
		
		userResultBo.setUserResultEntity(userResultEntity);

		return userResultBo;
	}
}
