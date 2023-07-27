package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.exerciseplan;
import org.springframework.stereotype.Repository;
@Repository
public interface exerciseplanrepository extends JpaRepository<exerciseplan,Integer> {

}
