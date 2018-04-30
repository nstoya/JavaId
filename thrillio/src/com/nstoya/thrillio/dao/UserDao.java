package com.nstoya.thrillio.dao;

import com.nstoya.thrillio.DataStore;
import com.nstoya.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		//SQL Queries
		return DataStore.getUsers();
	}

}
