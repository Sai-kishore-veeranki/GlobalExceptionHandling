package com.vsk.ExceptionHandling.services;


import com.vsk.ExceptionHandling.entities.Product;
import com.vsk.ExceptionHandling.exception.ProductNotFoundException;
import com.vsk.ExceptionHandling.repositories.ProductRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {


    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }//using the constructor injection to inject the productrepository class to the productservice class or you can use  the field injection too


    public Product createProduct(Product product){
        return productRepository.save(product);
    }


    //getting the product by its id and if the product is not found then it throws the product not found exception
    public Product getProductById(Long productId){
        return productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("product not found:"+productId));
    }


    //getting the all products
    public List<Product> AllProducts(){
        return productRepository.findAll();
    }



}
