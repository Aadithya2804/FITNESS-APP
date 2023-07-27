package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.workoutplan;
import org.springframework.stereotype.Repository;
@Repository
public interface workoutplanrepository extends JpaRepository<workoutplan,Integer>{

}
