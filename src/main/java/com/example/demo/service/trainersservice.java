package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.trainers;
import com.example.demo.repository.trainersrepository;

@Service
public class trainersservice
{

	@Autowired
	trainersrepository trainersrepo;
	public String trainersdeletefunction(int trainer_id)
	{
		if(trainersrepo.existsById(trainer_id))
		{
			trainersrepo.deleteById(trainer_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The Trainer doesnt exist";
		}
	}
	public String trainersupdatefunction(int trainer_id,trainers tool)
	{
		if(trainersrepo.existsById(trainer_id)) 
		{
			trainers object=new trainers();
			object.setTrainer_id(tool.getTrainer_id());
			
			object.setEmail_id(tool.getEmail_id());

			object.setName(tool.getName());
			
			object.setContact(tool.getContact());

			trainersrepo.save(tool);
			return "Updated";
		}
		else
		{
			return "The Trainer with Id " +trainer_id+ " doesnt exist";
		}
	}
	public Optional<trainers> findtrainersbyid(int trainer_id) 
	{
		return trainersrepo.findById(trainer_id);
	}
	

}

