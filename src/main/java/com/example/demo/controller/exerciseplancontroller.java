package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.equipments;
import com.example.demo.model.exerciseplan;
import com.example.demo.repository.exerciseplanrepository;
import com.example.demo.service.exerciseplanservice;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class exerciseplancontroller {

	@Autowired
	exerciseplanrepository exerciserepo;
	@Autowired
	exerciseplanservice exerciseservice;
	@GetMapping("/getallexerciseplans")
	List<exerciseplan> getList()
	{
		return exerciserepo.findAll();
	}
	@GetMapping("/getexerciseplan/{exerciseplan_id}")
	public Optional <exerciseplan> getexerciseplanbyid(@PathVariable int exerciseplan_id)
	{
		return exerciseservice.findexerciseplanbyid(exerciseplan_id);
	}
	@PostMapping("/postexerciseplan")
	public exerciseplan postfunction(@RequestBody exerciseplan exercise)
	{
		return exerciserepo.save(exercise);
	}
	
	@DeleteMapping("/deleteexerciseplan/{exerciseplan_id}")
	public String delfunc(@PathVariable int exerciseplan_id)
	{
		return exerciseservice.exerciseplandeletefunction(exerciseplan_id);
	}
	@PutMapping("/updateexerciseplan/{exerciseplan_id}")
	public String updfunc(@PathVariable int exerciseplan_id,@RequestBody exerciseplan exercise)
	{
		return exerciseservice.exerciseplanupdatefunction(exerciseplan_id,exercise);
	}
}

