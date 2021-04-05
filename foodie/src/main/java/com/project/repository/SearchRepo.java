package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.entity.Restaurant;
import com.project.model.RestaurantDto;

public interface SearchRepo extends CrudRepository<Restaurant,Integer>{

	///@Query("select r.restaurantName from Restaurant r where r.dishes.get(0).getDishId()=dishId")
	//public String findRestaurantNameByDishesDish(Dish dish);
	public List<Restaurant> getAllRestaurantByArea(String area);

}
