package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.clients;
import org.springframework.stereotype.Repository;
@Repository
public interface clientsrepository extends JpaRepository<clients,Integer>
{
		
}
