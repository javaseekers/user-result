package com.user.result.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.result.entity.UserResultEntity;
import com.user.result.repo.UserResultRepository;

@Service
public class UserResultService
{
	@Autowired
	UserResultRepository  userResultRepository;
	
	public List<UserResultEntity> getByEmail(String email)
	{
		return userResultRepository.getByEmail(email);
	}

}
