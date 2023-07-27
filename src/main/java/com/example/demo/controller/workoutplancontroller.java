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

import com.example.demo.model.trainers;
import com.example.demo.model.workoutplan;
import com.example.demo.repository.workoutplanrepository;
import com.example.demo.service.workoutplanservice;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class workoutplancontroller {

	@Autowired
	workoutplanrepository workoutrepo;
	@Autowired
	workoutplanservice workoutservice;
	@GetMapping("/getallworkoutplan")
	List<workoutplan> getList()
	{
		return workoutrepo.findAll();
	}
	@GetMapping("/getworkoutplan/{workoutplan_id}")
	public Optional <workoutplan> getworkoutplanbyid(@PathVariable int workoutplan_id)
	{
		return workoutservice.findworkoutplanbyid(workoutplan_id);
	}
	@PostMapping("/postworkoutplan")
	public workoutplan postfunction(@RequestBody workoutplan workout)
	{
		return workoutrepo.save(workout);
	}
	
	@DeleteMapping("/deleteworkoutplan/{workoutplan_id}")
	public String delfunc(@PathVariable int workoutplan_id)
	{
		return workoutservice.workoutplandeletefunction(workoutplan_id);
	}
	@PutMapping("/updateworkoutplan/{workoutplan_id}")
	public String updfunc(@PathVariable int workoutplan_id,@RequestBody workoutplan workout)
	{
		return workoutservice.workoutplanupdatefunction(workoutplan_id,workout);
	}
}

