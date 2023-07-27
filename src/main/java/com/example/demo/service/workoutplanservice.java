package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.workoutplanrepository;
import com.example.demo.model.clients;
import com.example.demo.model.equipments;
import com.example.demo.model.workoutplan;

@Service
public class workoutplanservice
{

	@Autowired
	workoutplanrepository workoutrepo;
	public String workoutplandeletefunction(int workoutplan_id)
	{
		if(workoutrepo.existsById(workoutplan_id))
		{
			workoutrepo.deleteById(workoutplan_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The Workoutplan doesnt exist";
		}
	}
	public String workoutplanupdatefunction(int workoutplan_id,workoutplan tool)
	{
		if(workoutrepo.existsById(workoutplan_id)) 
		{
			workoutplan object=new workoutplan();
			object.setWorkoutplan_id(tool.getWorkoutplan_id());
			
			object.setExerciseplan_id(tool.getExerciseplan_id());

			object.setDietplan_id(tool.getDietplan_id());
			
			object.setMonths(tool.getMonths());
			
			object.setRecommendedby(tool.getRecommendedby());

			workoutrepo.save(tool);
			return "Updated";
		}
		else
		{
			return "The Workoutplan with Id " +workoutplan_id+ " doesnt exist";
		}
	}
	public Optional<workoutplan> findworkoutplanbyid(int workoutplan_id) 
	{
		return workoutrepo.findById(workoutplan_id);
	}

}

