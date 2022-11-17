package com.bootcampAssessment.codingExercise.Service;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Custom> getCustomById(long id) {
		return repo.findById(id);
	}
	
	public Custom updateCustom(Custom updatedCustom,long id) {
		Optional<Custom> custom = repo.findById(id);
		
		if (custom.isPresent()) {
			Custom finalCustom = custom.get();
			
			finalCustom.setFirstName(updatedCustom.getFirstName());
			finalCustom.setLastName(updatedCustom.getLastName());
			finalCustom.setPhoneNumber(updatedCustom.getPhoneNumber());
			finalCustom.setEmail(updatedCustom.getEmail());
			
			return repo.save(updatedCustom);
		}
			return null;
	}
	
	public void deleteCustom(long id) {
		Optional<Custom> custom = repo.findById(id);
		
		if (custom.isPresent()) {
			repo.deleteById(id);
		}
		
	}
	
	public void deleteAllCustoms( ) {
		repo.deleteAll();
	}
}
