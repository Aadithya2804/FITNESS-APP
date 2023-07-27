package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.clients;
import com.example.demo.repository.clientsrepository;


@Service
public class clientsservice {
	@Autowired
	clientsrepository clientrepo;
	
	public String clientdeletefunction(int client_id)
	{
		if(clientrepo.existsById(client_id))
		{
			clientrepo.deleteById(client_id);
		return "Successfully Deleted";
		}
		else
		{
			return "The Clients doesnt exist";
		}
	}
	public String clientupdatefunction(int client_id,clients arun)
	{
		if(clientrepo.existsById(client_id)) 
		{
			clients object=new clients();
			object.setClient_id(arun.getClient_id());
			
			object.setEmail_id(arun.getEmail_id());

			object.setContact(arun.getContact());


			object.setTrainer_id(arun.getTrainer_id());

			clientrepo.save(arun);
			return "Updated";
		}
		else
		{
			return "The Client with Id " +client_id+ " doesnt exist";
		}
	}
	public Optional<clients> findclientbyid(int client_id) 
	{
		return clientrepo.findById(client_id);
	}

}

