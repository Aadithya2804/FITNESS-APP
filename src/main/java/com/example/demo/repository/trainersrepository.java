package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.trainers;
import org.springframework.stereotype.Repository;
@Repository
public interface trainersrepository extends JpaRepository<trainers,Integer>{

}
