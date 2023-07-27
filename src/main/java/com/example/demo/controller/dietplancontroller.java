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


import com.example.demo.model.dietplan;
import com.example.demo.repository.dietplanrepository;
import com.example.demo.service.dietplanservice;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class dietplancontroller 
{

	@Autowired
	dietplanrepository dietplanrepo;
	@Autowired
	dietplanservice dietservice;
	@GetMapping("/getalldietplans")
	List<dietplan> getList()
	{
		return dietplanrepo.findAll();
	}
	@GetMapping("/getdietplan/{diet_id}")
	public Optional <dietplan> getdietplanbyid(@PathVariable int dietplan_id)
	{
		return dietservice.finddietplanbyid(dietplan_id);
	}
	@PostMapping("/postdietplan")
	public dietplan postfunction(@RequestBody dietplan diet)
	{
		return dietplanrepo.save(diet);
	}
	
	@DeleteMapping("/deletedietplan/{dietplan_id}")
	public String delfunc(@PathVariable int dietplan_id)
	{
		return dietservice.dietplandeletefunction(dietplan_id);
	}
	@PutMapping("/updatedietplan/{dietplan_id}")
	public String updfunc(@PathVariable int dietplan_id,@RequestBody dietplan diet)
	{
		return dietservice.dietplanupdatefunction(dietplan_id,diet);
	} 
}


