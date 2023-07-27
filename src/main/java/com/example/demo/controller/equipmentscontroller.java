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
import com.example.demo.repository.equipmentsrepository;
import com.example.demo.service.equipmentsservice;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class equipmentscontroller
{
	@Autowired
	equipmentsrepository equiprepo;
	@Autowired
	equipmentsservice equipservice;
	@GetMapping("/getallequipments")
	public List<equipments> getList()
	{
		return equiprepo.findAll();
	}
	@GetMapping("/getequipment/{equipment_id}")
	public Optional <equipments> getequipmentbyid(@PathVariable int equipment_id)
	{
		return equipservice.findequipmentbyid(equipment_id);
	}
	@PostMapping("/postequipment")
	public equipments postfunction(@RequestBody equipments tool)
	{
		return equiprepo.save(tool);
	}
	
	@DeleteMapping("/deleteequipment/{equipment_id}")
	public String delfunc(@PathVariable int equipment_id)
	{
		return equipservice.equipmentdeletefunction(equipment_id);
	}
	@PutMapping("/updateequipment/{equipment_id}")
	public String updfunc(@PathVariable int equipment_id,@RequestBody equipments tool)
	{
		return equipservice.equipmentupdatefunction(equipment_id,tool);
	}
}

