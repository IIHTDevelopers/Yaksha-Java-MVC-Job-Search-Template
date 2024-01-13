package com.yaksha.training.job.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.job.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

	// write your logic here to add other methods

	// feel free to update this and write custom query
	Page<Job> findByJobTitleAndJobDescription(@Param("keyword") String keyword, Pageable pageable);

}
