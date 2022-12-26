package com.spring.jdbc.sample.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.sample.dto.GenericResponse;
import com.spring.jdbc.sample.dto.UserDto;
import com.spring.jdbc.sample.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void save(UserDto user) throws SQLException {
		userRepository.save(user);

	}

	public List<UserDto> getAllUsers() throws SQLException {

		return UserRepository.getAllUsers();
	}

	

	public void update(UserDto user) throws SQLException {
		userRepository.update(user);
		
		
	}
	public void delete(UserDto user) throws SQLException {
		userRepository.delete(user);
}

//	public UserDto getById(Integer id) throws SQLException {
	
//		return userRepository.getById(id);
	}
	

	

	
