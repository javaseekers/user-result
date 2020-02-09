package com.user.result.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.result.entity.UserResultEntity;

@Repository
public interface UserResultRepository
	extends
		JpaRepository<UserResultEntity, Integer>
{

	public List<UserResultEntity> getByEmail(String email);

}
