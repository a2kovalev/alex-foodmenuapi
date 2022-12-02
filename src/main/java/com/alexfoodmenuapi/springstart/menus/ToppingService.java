package com.alexfoodmenuapi.springstart.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {
	
	@Autowired
	private ToppingRepository toppingRepo;
	
	public List<Topping> getAllToppings(String code) {
		List<Topping> tops = new ArrayList<>();
		toppingRepo.findByFoodTypeCode(code).forEach(tops::add);
		return tops;
	}
	
	public void addTopping(Topping top) {
		toppingRepo.save(top);
	}

	public Topping getTopping(String id) {
		Topping top = toppingRepo.findById(id).get();
		return top;
	}

	public void updateTopping(Topping top) {
		toppingRepo.save(top);
	}
	
	public void deleteTopping(String id) {
		toppingRepo.deleteById(id);
	}
}
