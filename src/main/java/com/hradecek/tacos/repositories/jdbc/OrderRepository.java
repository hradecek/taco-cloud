package com.hradecek.tacos.repositories.jdbc;

import com.hradecek.tacos.models.Order;

public interface OrderRepository {

    Order save(Order order);
}
