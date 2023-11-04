package com.atof1.users.service;

import java.util.List;

import com.atof1.users.entities.Role;
import com.atof1.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
