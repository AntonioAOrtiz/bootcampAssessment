package com.bootcampAssessment.codingExercise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampAssessment.codingExercise.Model.Custom;
import com.bootcampAssessment.codingExercise.Repo.CustomRepo;



@Service
public class CustomService {
	
	@Autowired
	private CustomRepo repo;
	
	public void addCustom(Custom custom) {
		repo.save(custom);
	}
	
	public List<Custom> getAllCustoms() {
		return repo.findAll();
	}
}
