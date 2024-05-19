package com.MathStore.tiendita_online.backend.domain.port;

import com.MathStore.tiendita_online.backend.domain.model.Product;

//CRUD METHODS
public interface IProductRepository {
    Product save(Product product);
    Iterable<Product> finAll();
    Product findById (Integer id);
    void deleteById(Integer id);
}
