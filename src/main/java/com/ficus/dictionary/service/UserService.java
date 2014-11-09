package com.ficus.dictionary.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ficus.dictionary.domain.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(Long id);
	
	public List<User> findByRoleId(Integer roleId);
	
	public User save(User user);
	
	public void delete(User user);
	
	public Page<User> findAllByPage(Pageable pageable);
	
	//public Page<User> findUserByCriteria(SearchCriteria searchCriteria, Pageable pageable);
	
}
