package com.ficus.dictionary.repository;

import org.springframework.data.repository.CrudRepository;

import com.ficus.dictionary.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	//public List<User> find
}
