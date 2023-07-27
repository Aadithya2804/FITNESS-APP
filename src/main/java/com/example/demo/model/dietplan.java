package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class dietplan
{

	public int getDietplan_id() {
		return dietplan_id;
	}
	public void setDietplan_id(int dietplan_id) {
		this.dietplan_id = dietplan_id;
	}
	public String getDiet_name() {
		return diet_name;
	}
	public void setDiet_name(String diet_name) {
		this.diet_name = diet_name;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	@Id
	private int dietplan_id;
	private String diet_name;
	private int months;
}

