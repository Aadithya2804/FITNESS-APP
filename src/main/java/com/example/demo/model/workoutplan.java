package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class workoutplan 
{
	@Id
	private int workoutplan_id;
	private int exerciseplan_id;
	private int dietplan_id;
	private int months;
	private String recommendedby;
	public String getRecommendedby() {
		return recommendedby;
	}
	public void setRecommendedby(String recommendedby) {
		this.recommendedby = recommendedby;
	}
	public int getWorkoutplan_id() {
		return workoutplan_id;
	}
	public void setWorkoutplan_id(int workoutplan_id) {
		this.workoutplan_id = workoutplan_id;
	}
	public int getExerciseplan_id() {
		return exerciseplan_id;
	}
	public void setExerciseplan_id(int exerciseplan_id) {
		this.exerciseplan_id = exerciseplan_id;
	}
	public int getDietplan_id() {
		return dietplan_id;
	}
	public void setDietplan_id(int dietplan_id) {
		this.dietplan_id = dietplan_id;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
}
