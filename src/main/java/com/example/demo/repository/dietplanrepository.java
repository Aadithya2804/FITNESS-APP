package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dietplan;
import org.springframework.stereotype.Repository;
@Repository
public interface dietplanrepository extends JpaRepository<dietplan,Integer>{

}
