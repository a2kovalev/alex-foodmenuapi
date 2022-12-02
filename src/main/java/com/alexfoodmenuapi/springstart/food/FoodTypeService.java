package com.alexfoodmenuapi.springstart.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodTypeService {
	
	@Autowired
	private FoodTypeRepository foodTypeRepo;
	
	public List<FoodType> getAllFoodTypes() {
		List<FoodType> types = new ArrayList<>();
		foodTypeRepo.findAll().forEach(types::add);
		return types;
	}
	
	public void addFoodType(FoodType foodType) {
		foodTypeRepo.save(foodType);
	}

	public FoodType getFoodType(String code) {
		FoodType type = foodTypeRepo.findById(code).get();
		return type;
	}

	public void updateFoodType(FoodType foodType) {
		foodTypeRepo.save(foodType);
	}
	
	public void removeFoodType(String code) {
		foodTypeRepo.deleteById(code);
	}
}
