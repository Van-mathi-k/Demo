package com.hlag.shippingmanagement.service;

import java.util.Optional;

import shippingmanagementsystem.userentity.UserMaster;

public interface UserServiceInterface {
	public UserMaster createUser(UserMaster userMaster);

	public Optional<UserMaster> getByUserId(String id);

	public boolean updateUserMaster(int id, String username);

}
