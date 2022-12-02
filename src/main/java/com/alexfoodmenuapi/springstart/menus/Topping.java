package com.alexfoodmenuapi.springstart.menus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.alexfoodmenuapi.springstart.food.FoodType;

@Entity
public class Topping {
	@Id
	private String id;
	private String name;
	private int calories;
	@ManyToOne
	private FoodType foodType;
	
	public Topping() {
		
	}
	
	public Topping(String id, String name, int calories, String foodCode) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.foodType = new FoodType(foodCode, "", "", 0);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	
}
