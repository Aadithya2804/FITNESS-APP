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

import com.example.demo.repository.clientsrepository;
import com.example.demo.service.clientsservice;
//import com.example.demo.Service.fitnessservice;


import org.springframework.web.bind.annotation.RestController;
@RestController
public class clientscontroller {

	@Autowired 
	clientsrepository clientrepo;
	@Autowired
	clientsservice clientservice;
	@GetMapping("/getallclients")
	public List<clients> getList()
	{
		return clientrepo.findAll();
	}
	@GetMapping("/getclient/{client_id}")
	public Optional <clients>getclientById(@PathVariable int client_id)
	{
		return clientservice.findclientbyid(client_id);
	}
	@PostMapping("/postclient")
	public clients postfunction(@RequestBody clients arun)
	{
		return clientrepo.save(arun);
	}
	
	@DeleteMapping("/deleteclient/{client_id}")
	public String delfunc(@PathVariable int client_id)
	{
		return clientservice.clientdeletefunction(client_id);
	}
	@PutMapping("/updateclient/{client_id}")
	public String updfunc(@PathVariable int client_id,@RequestBody clients arun)
	{
		return clientservice.clientupdatefunction(client_id,arun);
	} 
}
