package com.yaksha.training.job.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.job.entity.Job;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/job", "/" })
public class JobController {

	@RequestMapping(value = { "/list", "/", "/search" })
	public String listJobs(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveJob")
	public String saveJob(@Valid @ModelAttribute("job") Job theJob, BindingResult bindingResult, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("jobId") Long jobId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("jobId") Long jobId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/markFav")
	public String updateIsFav(@RequestParam("isFav") boolean isFav, @RequestParam("jobId") Long jobId, Model theModel) {
		// write your logic here
		return "";
	}

	@RequestMapping("/searchFav")
	public String searchAppointment(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			Model theModel, @PageableDefault(size = 5) Pageable pageable) {
		// write your logic here
		return "";
	}
}
