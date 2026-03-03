package com.intanmaijunaidi.vis_writingwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intanmaijunaidi.vis_writingwebapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);
    boolean existsByUsername(String username);
	
}
