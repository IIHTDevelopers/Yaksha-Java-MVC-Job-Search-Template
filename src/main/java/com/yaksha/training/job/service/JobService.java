package com.yaksha.training.job.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.job.entity.Job;

@Service
public class JobService {

	public List<Job> getJobs() {
		// write your logic here
		return null;
	}

	public Job saveJob(Job theJob) {
		// write your logic here
		return null;
	}

	public Job getJob(Long jobId) {
		// write your logic here
		return null;
	}

	public boolean deleteJob(Job job) {
		// write your logic here
		return false;
	}

	public Page<Job> searchJobs(String searchKey, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateIsFav(boolean isFav, Long id) {
		// write your logic here
		return false;
	}

	public Page<Job> searchFavJobs(String searchKey, Pageable pageable) {
		// write your logic here
		return null;
	}

}
