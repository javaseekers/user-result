package com.user.result.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public @Data class UserResultEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer score;
	@Column(name="test_series")
	private String testSeries;
	@Column
	private String email;
	
	
}
