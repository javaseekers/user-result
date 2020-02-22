package com.result.dto;

import com.result.entity.ResultEntity;

import lombok.Data;

public @Data class UserResultDTO {
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private  ResultEntity resultEntity; 
	
}
