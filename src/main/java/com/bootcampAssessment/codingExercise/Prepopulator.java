package com.bootcampAssessment.codingExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bootcampAssessment.codingExercise.Model.Custom;
import com.bootcampAssessment.codingExercise.Repo.CustomRepo;

@Component
public class Prepopulator implements CommandLineRunner {
	
	@Autowired
	private CustomRepo repo;
	
	@Override
	public void run(String... args) throws Exception{
		Custom custom1 = new Custom("Antonio", "Ortiz", "654321987","antonioortiz@gmail.com");
		repo.save(custom1);
		
		Custom custom2 = new Custom("Gabriel","Simu","987654321","gabrielsimu@gmail.com");
		repo.save(custom2);
	}
}
