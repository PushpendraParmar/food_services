package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
