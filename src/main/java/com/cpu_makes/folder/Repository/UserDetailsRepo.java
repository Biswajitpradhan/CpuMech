package com.cpu_makes.folder.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpu_makes.folder.Entity.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer>{
	Optional<UserDetails> findByEmailAndPassword(String email,String password);
}
