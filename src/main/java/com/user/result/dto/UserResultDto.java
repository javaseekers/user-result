package com.user.result.dto;

import com.user.result.entity.UserResultEntity;

import lombok.Data;

public @Data class UserResultDto
{
	private String firstName;
	private String lastName;
	private String address;
	private Long phoneNo;
	private UserResultEntity userResultEntity;
}
