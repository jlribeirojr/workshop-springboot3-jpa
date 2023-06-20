package com.joseluis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluis.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
