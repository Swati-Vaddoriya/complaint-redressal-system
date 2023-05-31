package com.simplilearn.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.Manager;

public interface ManagerRepo extends JpaRepository<Manager, Integer>{

	public	Optional<Manager> findByFullNameAndPass(String name,String password);

}
