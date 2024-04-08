package com.facility.system.main.services;

import com.facility.system.main.entities.Product;
import com.facility.system.main.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> o = repository.findById(id);
        return o.get();
    }
}
