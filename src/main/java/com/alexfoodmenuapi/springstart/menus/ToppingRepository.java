package com.alexfoodmenuapi.springstart.menus;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ToppingRepository extends CrudRepository<Topping, String> {
	//Spring JPA will automatically search for FoodTypes with the given code since we named in "findByFoodTypeCode"
	public List<Topping> findByFoodTypeCode(String code);
}
