package javaReactDay6Hw3.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaReactDay6Hw3.hrms.business.absratcs.JobService;
import javaReactDay6Hw3.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	private JobService jobService;
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobService.getAll();
		
	}
}
