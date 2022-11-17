package com.bootcampAssessment.codingExercise.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampAssessment.codingExercise.Model.Custom;

@Repository
public interface CustomRepo extends JpaRepository<Custom, Long> {

}
