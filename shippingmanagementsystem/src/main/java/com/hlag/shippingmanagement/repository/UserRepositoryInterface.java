package com.hlag.shippingmanagement.repository;

import java.util.Optional;

import shippingmanagementsystem.userentity.UserMaster;

public interface UserRepositoryInterface {
	public UserMaster createUser(UserMaster userMaster);

	public Optional<UserMaster> getByUserId(int id);

	public UserMaster updateUserMaster(int id, UserMaster userMaster);

}
