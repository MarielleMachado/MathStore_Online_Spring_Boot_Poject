package com.MathStore.tiendita_online.backend.domain.port;

import com.MathStore.tiendita_online.backend.domain.model.Category;

public interface ICategoryRepository {
    Category save(Category category);
    Iterable<Category> findAll();
    Category findById(Integer id);
    void deleteById(Integer id);
}
