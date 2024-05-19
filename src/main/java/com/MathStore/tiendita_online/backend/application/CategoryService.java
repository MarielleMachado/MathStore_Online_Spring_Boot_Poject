package com.MathStore.tiendita_online.backend.application;

import com.MathStore.tiendita_online.backend.domain.model.Category;
import com.MathStore.tiendita_online.backend.domain.port.ICategoryRepository;

public class CategoryService {
    private final ICategoryRepository iCategoryRepository;

    public CategoryService(ICategoryRepository iCategoryRepository) {
        this.iCategoryRepository = iCategoryRepository;
    }
    public Category save (Category category){
        return this.iCategoryRepository.save(category);
    }
    public Iterable<Category> findAll(){
        return this.iCategoryRepository.findAll();
    }
    public Category findById(Integer id){
        return this.iCategoryRepository.findById(id);
    }
    public  void DeleteByID(Integer id){
        this.iCategoryRepository.deleteById(id);
    }
}
