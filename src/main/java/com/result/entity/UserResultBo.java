package com.result.entity;

import lombok.Data;

public @Data class UserResultBo {
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private  ResultEntity resultEntity; 
	
}
