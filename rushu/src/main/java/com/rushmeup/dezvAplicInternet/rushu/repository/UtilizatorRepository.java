package com.rushmeup.dezvAplicInternet.rushu.repository;

import org.springframework.data.repository.CrudRepository;

import com.rushmeup.dezvAplicInternet.rushu.entity.Utilizator;

public interface UtilizatorRepository extends CrudRepository <Utilizator, Long>{

	Utilizator findByEmail(String email);
	Utilizator findByUsername(String username);
	Utilizator findByName(String name);
	
	
}
