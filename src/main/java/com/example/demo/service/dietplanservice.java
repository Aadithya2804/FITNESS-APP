package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dietplan;
import com.example.demo.repository.dietplanrepository;

@Service
public class dietplanservice {

	@Autowired
	dietplanrepository dietrepo;
	public String dietplandeletefunction(int dietplan_id)
	{
		if(dietrepo.existsById(dietplan_id))
		{
			dietrepo.deleteById(dietplan_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The dietplan doesnt exist";
		}
	}
	public String dietplanupdatefunction(int dietplan_id,dietplan arun)
	{
		if(dietrepo.existsById(dietplan_id)) 
		{
			dietplan food=new dietplan();
			food.setDietplan_id(arun.getDietplan_id());
			
			food.setDiet_name(arun.getDiet_name());

			food.setMonths(arun.getMonths());


			dietrepo.save(arun);
			return "Updated";
		}
		else
		{
			return "The Dietplan with Id " +dietplan_id+ " doesnt exist";
		}
	}
	public Optional<dietplan> finddietplanbyid(int dietplan_id) 
	{
		return dietrepo.findById(dietplan_id);
	}
	
}
