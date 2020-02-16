package com.user.result.entity;

import lombok.Data;

public @Data class UserResultBo
{
	private String firstName;
	private String lastName;
	private String address;
	private Long phoneNo;
	private UserResultEntity userResultEntity;
}
