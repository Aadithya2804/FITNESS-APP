package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.equipments;
import org.springframework.stereotype.Repository;
@Repository
public interface equipmentsrepository extends JpaRepository<equipments,Integer>
{

}
