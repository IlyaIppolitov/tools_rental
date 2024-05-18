package com.itexclusive.toolsrental.dao;


import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    T save(T t);
    List<T> all();
    Optional<T> findById(int id);
    T update(T t);
    boolean delete(int id);
}

