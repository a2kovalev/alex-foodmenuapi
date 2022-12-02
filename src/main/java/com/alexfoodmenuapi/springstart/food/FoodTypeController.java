package com.alexfoodmenuapi.springstart.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodTypeController {
	
	@Autowired
	private FoodTypeService foodTypeService;
	
	@RequestMapping("/foodtypes")
	public List<FoodType> getAllFoodTypes() {
		return foodTypeService.getAllFoodTypes();
	}
	
	@RequestMapping("/foodtypes/{code}")
	public FoodType getFoodType(@PathVariable String code) {
		return foodTypeService.getFoodType(code);
	}
	
	@PostMapping("/foodtypes")
	public void addFoodType(@RequestBody FoodType foodType) {
		foodTypeService.addFoodType(foodType);
	}
	
	@PutMapping("/foodtypes/{code}")
	public void updateFoodType(@RequestBody FoodType foodType) {
		foodTypeService.updateFoodType(foodType);
	}
	
	@DeleteMapping("/foodtypes/{code}")
	public void removeFoodType(@PathVariable String code) {
		foodTypeService.removeFoodType(code);
	}
}
