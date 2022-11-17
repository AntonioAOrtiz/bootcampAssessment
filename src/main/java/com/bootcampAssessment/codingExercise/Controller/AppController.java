package com.bootcampAssessment.codingExercise.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcampAssessment.codingExercise.Model.Custom;
import com.bootcampAssessment.codingExercise.Service.CustomService;

@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	CustomService customService;
	
	@GetMapping(path = "/customs")
	public List<Custom> getCustoms() {
		return customService.getAllCustoms();
	}
	
	@GetMapping(path = "/customs/{id}")
	public Optional<Custom> getCustomsById(@PathVariable("id") long id) {
		return customService.getCustomById(id);
	}
	
	@PostMapping(path = "/custom")
	public void sendCustoms(@RequestBody Custom custom) {
		customService.addCustom(custom);
	}
	
	@PutMapping("/custom/{id}")
	public Custom updateCustom(@PathVariable long id, @RequestBody Custom custom) {
		return customService.updateCustom(custom, id);
	}
	
	@DeleteMapping("/custom/{id}")
	public void deleteCustom(@PathVariable long id) {
		customService.deleteCustom(id);
	}
	
	@DeleteMapping("/customs")
	public void deleteAllCustoms() {
		customService.deleteAllCustoms();
	}
	
	
}
