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

import com.example.demo.model.clients;
import com.example.demo.model.exerciseplan;
import com.example.demo.model.trainers;
import com.example.demo.repository.trainersrepository;
import com.example.demo.service.trainersservice;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class trainerscontroller {

	@Autowired
	trainersrepository trainersrepo;
	@Autowired
	trainersservice trainerservice;
	@GetMapping("/getalltrainers")
	List<trainers> getList()
	{
		return trainersrepo.findAll();
	}
	@GetMapping("/gettrainer/{trainer_id}")
	public Optional <trainers> gettrainersbyid(@PathVariable int trainer_id)
	{
		return trainerservice.findtrainersbyid(trainer_id);
	}
	@PostMapping("/posttrainer")
	public trainers postfunction(@RequestBody trainers trainer)
	{
		return trainersrepo.save(trainer);
	}
	
	@DeleteMapping("/deletetrainer/{trainer_id}")
	public String delfunc(@PathVariable int trainer_id)
	{
		return trainerservice.trainersdeletefunction(trainer_id);
	}
	@PutMapping("/updatetrainers/{trainer_id}")
	public String updfunc(@PathVariable int trainer_id,@RequestBody trainers trainer)
	{
		return trainerservice.trainersupdatefunction(trainer_id,trainer);
	}
}
