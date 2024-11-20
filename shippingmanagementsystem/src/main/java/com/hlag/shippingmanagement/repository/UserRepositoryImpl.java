package com.hlag.shippingmanagement.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import shippingmanagementsystem.userentity.UserMaster;

public class UserRepositoryImpl implements UserRepositoryInterface {

	List<UserMaster> userMasters = new ArrayList<>();

	@Override
	public UserMaster createUser(UserMaster userMaster) {

		userMasters.add(userMaster);
		System.out.println("User was created" + userMaster);
		return userMaster;

	}

	@Override
	public Optional<UserMaster> getByUserId(int id) {
		// TODO Auto-generated method stub

		return userMasters.stream().filter(e -> e.getId() == id).findFirst();

	}

	@Override
	public UserMaster updateUserMaster(int id, UserMaster userMaster) {
		// TODO Auto-generated method stub

		Optional<UserMaster> existeUser = getByUserId(id);

		if (existeUser.isPresent()) {
			userMasters.add(userMaster);
		}
		return userMaster;
	}

}
