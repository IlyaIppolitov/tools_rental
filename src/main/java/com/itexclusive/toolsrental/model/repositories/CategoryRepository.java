package com.itexclusive.toolsrental.model.repositories;

import com.itexclusive.toolsrental.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
