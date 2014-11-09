package com.ficus.dictionary.service.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ficus.dictionary.domain.Role;
import com.ficus.dictionary.domain.User;
import com.ficus.dictionary.repository.RoleRepository;
import com.ficus.dictionary.repository.UserRepository;
import com.ficus.dictionary.service.UserService;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User save(User user) {
		if(user.getId() == null){
			System.out.println(new Date());
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleRepository.findByName("ROLE_USER"));
			user.setRoles(roles);
			user.setEnabled(true);
			user.setCreated(new Date());
			user.setUpdated(new Date());
		} else {
			user.setUpdated(new Date());
		}
		
		return userRepository.save(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public Page<User> findAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
