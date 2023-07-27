package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.equipments;
import com.example.demo.model.exerciseplan;
import com.example.demo.repository.exerciseplanrepository;

@Service
public class exerciseplanservice
{
	@Autowired
	exerciseplanrepository exerciserepo;
	public String exerciseplandeletefunction(int exercise_id)
	{
		if(exerciserepo.existsById(exercise_id))
		{
			exerciserepo.deleteById(exercise_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The Exerciseplan doesnt exist";
		}
	}
	public String exerciseplanupdatefunction(int exercise_id,exerciseplan tool)
	{
		if(exerciserepo.existsById(exercise_id)) 
		{
			exerciseplan object=new exerciseplan();
			object.setExercise_id(tool.getExercise_id());
			
			object.setMonths(tool.getMonths());

			object.setExercise_name(tool.getExercise_name());
			
			object.setDietplan_id(tool.getDietplan_id());
			
			exerciserepo.save(tool);
			return "Updated";
		}
		else
		{
			return "The Exerciseplan with Id " +exercise_id+ " doesnt exist";
		}
	}
	public Optional<exerciseplan> findexerciseplanbyid(int exercise_id) 
	{
		return exerciserepo.findById(exercise_id);
	}
}
