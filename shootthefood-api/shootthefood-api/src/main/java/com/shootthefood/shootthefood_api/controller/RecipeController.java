package com.shootthefood.shootthefood_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/v1")
public class RecipeController {

	
	@GetMapping("/recipes")
	public List<Map<String, String>> listReipes(){
		return List.of(
				
				Map.of("id","1","name", "Spaghetti Bolognese", "description", "A classic Italian pasta dish with rich meat sauce."),
				Map.of("id","2","name", "Chicken Curry", "description", "A flavorful curry dish with tender chicken pieces."),
				Map.of("id","3","name", "Vegetable Stir Fry", "description", "A quick and healthy stir fry with fresh vegetables.")
			);
	}
	
	
}
