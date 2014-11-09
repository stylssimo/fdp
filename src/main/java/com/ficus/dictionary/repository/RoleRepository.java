package com.ficus.dictionary.repository;
import org.springframework.data.repository.CrudRepository;

import com.ficus.dictionary.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	public Role findByName(String roleName);
}
