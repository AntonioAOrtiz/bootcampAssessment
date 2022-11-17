package com.bootcampAssessment.codingExercise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcampAssessment.codingExercise.Model.Custom;
import com.bootcampAssessment.codingExercise.Service.CustomService;

@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	CustomService customservice;
	
	@GetMapping(path = "/customs")
	public List<Custom> getCustoms() {
		return customservice.getAllCustoms();
	}
	
	@PostMapping(path = "/custom")
	public void sendCustoms(@RequestBody Custom custom) {
		customservice.addCustom(custom);
	}
}
