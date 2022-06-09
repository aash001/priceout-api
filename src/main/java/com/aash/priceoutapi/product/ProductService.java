package com.aash.priceoutapi.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public Iterable<Product> list() {
    return productRepository.findAll();
  }
}