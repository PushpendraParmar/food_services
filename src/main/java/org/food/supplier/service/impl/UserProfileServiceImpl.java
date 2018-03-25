package org.food.supplier.service.impl;

import java.util.List;

import org.food.supplier.dao.UserProfileDao;
import org.food.supplier.model.UserProfile;
import org.food.supplier.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao dao;
	
	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public UserProfile findByType(String type){
		return dao.findByType(type);
	}

	public List<UserProfile> findAll() {
		return dao.findAll();
	}
}
