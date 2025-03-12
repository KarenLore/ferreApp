package com.ferreApp.domain.repositories;

import java.util.List;

import com.ferreApp.domain.entities.Eps;

public interface EpsRepository {
    void save(Eps eps);
    Eps findById(int id);
    List<Eps> findAll();
    void update(Eps eps);
    void delete(int id);
}
