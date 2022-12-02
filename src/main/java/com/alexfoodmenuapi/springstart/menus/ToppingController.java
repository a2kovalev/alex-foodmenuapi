package com.alexfoodmenuapi.springstart.menus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alexfoodmenuapi.springstart.food.FoodType;

@RestController
public class ToppingController {
	
	@Autowired
	private ToppingService toppingService;
	
	@GetMapping("/foodtypes/{foodCode}/toppings/")
	public List<Topping> getAllToppings(@PathVariable String foodCode) {
		return toppingService.getAllToppings(foodCode);
	}
	
	@GetMapping("/foodtypes/{foodCode}/toppings/{id}")
	public Topping getTopping(@PathVariable String id) {
		return toppingService.getTopping(id);
	}
	
	@PostMapping("/foodtypes/{foodCode}/toppings/")
	public void addTopping(@RequestBody Topping top, @PathVariable String foodCode) {
		top.setFoodType(new FoodType(foodCode, "", "", 0));
		toppingService.addTopping(top);
	}
	
	@PutMapping("foodtypes/{foodCode}/toppings/{id}")
	public void updateTopping(@RequestBody Topping top, @PathVariable String foodCode) {
		top.setFoodType(new FoodType(foodCode, "", "", 0));
		toppingService.updateTopping(top);
	}
	
	@DeleteMapping("foodtypes/{foodCode}/toppings/{id}")
	public void removeTopping(@PathVariable String id) {
		toppingService.deleteTopping(id);
	}
}
