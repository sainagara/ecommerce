package com.demo.ecommerce.service;

import java.util.List;

import org.json.simple.JSONObject;
import com.demo.ecommerce.dto.LogInDto;
import com.demo.ecommerce.dto.UpdatePasswordDto;
import com.demo.ecommerce.dto.UpdateUserDetailsDto;
import com.demo.ecommerce.entities.User;

public interface UserService {

	JSONObject saveUser(User user);

	List<User> getUser();

	JSONObject verifylogin(LogInDto users);


	JSONObject updateUser(UpdateUserDetailsDto user, int id);

	JSONObject updateUserPassword(UpdatePasswordDto updatePasswordDto, int id);

	User getUserById(int id);
	
	JSONObject delateUser(int id);

	

}
