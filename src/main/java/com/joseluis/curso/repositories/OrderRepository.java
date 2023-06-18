package com.joseluis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluis.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
