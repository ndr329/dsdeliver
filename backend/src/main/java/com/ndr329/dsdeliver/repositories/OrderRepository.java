package com.ndr329.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndr329.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
