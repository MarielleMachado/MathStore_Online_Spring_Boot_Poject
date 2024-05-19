package com.MathStore.tiendita_online.backend.application;

import com.MathStore.tiendita_online.backend.domain.model.Product;
import com.MathStore.tiendita_online.backend.domain.port.IProductRepository;

public class ProductService {
    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }
    public Product save(Product product){
        return this.iProductRepository.save(product);
    }
    public Iterable<Product> finAll(){
        return this.iProductRepository.finAll();
    }
    public Product findById(Integer id){
        return  this.iProductRepository.findById(id);
    }
    public void deleteById(Integer id){
        this.iProductRepository.deleteById(id);
    }
}
