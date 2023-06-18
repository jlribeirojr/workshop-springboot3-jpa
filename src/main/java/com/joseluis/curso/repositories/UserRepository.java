package com.joseluis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluis.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
