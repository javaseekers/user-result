package com.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.entity.ResultEntity;
@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, Integer> {

	ResultEntity getResultByEmail(String email);

}
