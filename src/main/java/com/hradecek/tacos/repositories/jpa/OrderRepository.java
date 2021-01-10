package com.hradecek.tacos.repositories.jpa;

import com.hradecek.tacos.models.Order;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);
}
