package com.user.result.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "result")
public @Data class UserResultEntity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5457394827828462765L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	@Column
	private Integer score;
	@Column(name = "test_series")
	private String testSeries;
	@Column
	@JsonProperty("emailId")
	private String email;

}
