package com.rudra.aks.hikari.dao;

import com.rudra.aks.hikari.model.UserDTO;

public interface IUserDAO {

	UserDTO	getUser(int userid);

	void getPoolProperties();

	int getNoOfUsers();
}
