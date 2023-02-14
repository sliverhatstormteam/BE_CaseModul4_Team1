package com.backend.service;

import com.backend.model.Product;

import com.backend.model.query.GetImage;
import com.backend.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public Page<Product> getAll(Pageable pageable) {
        return iProductRepo.findAll(pageable);
    }
    public Product findByID(long id) {
        return iProductRepo.findById(id).get();
    }

    public Product save(Product product){
        return iProductRepo.save(product);
    }

    public void delete(long id){
        iProductRepo.deleteById(id);
    }

    public List<GetImage> getAllByImage(long id) {
        return iProductRepo.getImageById(id);
    }


}
