package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.equipments;
import com.example.demo.repository.equipmentsrepository;

@Service
public class equipmentsservice
{
	@Autowired
	equipmentsrepository equiprepo;

	public String equipmentdeletefunction(int equipment_id)
	{
		if(equiprepo.existsById(equipment_id))
		{
			equiprepo.deleteById(equipment_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The Equipment doesnt exist";
		}
	}
	public String equipmentupdatefunction(int equipment_id,equipments tool)
	{
		if(equiprepo.existsById(equipment_id)) 
		{
			equipments object=new equipments();
			object.setEquipment_id(tool.getEquipment_id());
			
			object.setPrice(tool.getPrice());

			object.setAvailable(tool.isAvailable());

			equiprepo.save(tool);
			return "Updated";
		}
		else
		{
			return "The Equipment with Id " +equipment_id+ " doesnt exist";
		}
	}
	public Optional<equipments> findequipmentbyid(int equipment_id) 
	{
		return equiprepo.findById(equipment_id);
	}
	

}
