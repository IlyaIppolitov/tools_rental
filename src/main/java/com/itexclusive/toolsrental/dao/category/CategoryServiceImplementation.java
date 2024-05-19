package com.itexclusive.toolsrental.dao.category;

import com.itexclusive.toolsrental.model.entities.Category;
import com.itexclusive.toolsrental.model.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImplementation implements CategoryService {
    private final CategoryRepository repo;

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }

    @Override
    public List<Category> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Category> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Category update(Category category) {
        return repo.save(category);
    }

    @Override
    public boolean delete(int id) {
        repo.deleteById(id);
        return true;
    }
}
