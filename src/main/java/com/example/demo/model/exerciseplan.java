package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class exerciseplan {

	
		@Id
		private int exercise_id;
		private int months;
		private String exercise_name;
		private int dietplan_id;
		public int getDietplan_id() {
			return dietplan_id;
		}
		public void setDietplan_id(int dietplan_id) {
			this.dietplan_id = dietplan_id;
		}
		public int getExercise_id() {
			return exercise_id;
		}
		public void setExercise_id(int exercise_id) {
			this.exercise_id = exercise_id;
		}
		public int getMonths() {
			return months;
		}
		public void setMonths(int months) {
			this.months = months;
		}
		public String getExercise_name() {
			return exercise_name;
		}
		public void setExercise_name(String exercise_name) {
			this.exercise_name = exercise_name;
		}
}
