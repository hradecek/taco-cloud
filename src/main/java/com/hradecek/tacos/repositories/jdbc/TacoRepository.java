package com.hradecek.tacos.repositories.jdbc;

import com.hradecek.tacos.models.Taco;

public interface TacoRepository {

    Taco save(Taco taco);
}
