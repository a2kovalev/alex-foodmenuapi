package com.alexfoodmenuapi.springstart.food;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
 public class FoodType {
	
	private String name;
	@Id
	private String code;
	private String description;
	private Integer baseCalories;
	
	public FoodType() {
		
	}
	
	public FoodType(String code, String name, String description, Integer baseCalories) {
		super();
		this.code = code;
		this.name = name;
		this.setDescription(description);
		this.baseCalories = baseCalories;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getBaseCalories() {
		return baseCalories;
	}

	public void setBaseCalories(Integer baseCalories) {
		this.baseCalories = baseCalories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
