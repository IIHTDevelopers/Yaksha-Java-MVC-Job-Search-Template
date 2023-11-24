package com.yaksha.training.job.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.job.entity.Job;

@Controller
@RequestMapping(value = { "/job", "/" })
public class JobController {

	@RequestMapping(value = { "/list", "/" })
	public String listJobs(Model theModel) {
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		return "";
	}

	@PostMapping("/saveJob")
	public String saveJob(@Valid @ModelAttribute("job") Job theJob, BindingResult bindingResult, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("jobId") Long jobId, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("jobId") Long jobId, Model theModel) {
		return "";
	}
}
