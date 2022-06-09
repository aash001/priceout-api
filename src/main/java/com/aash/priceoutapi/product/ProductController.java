package com.aash.priceoutapi.product;

import java.util.Map;
import java.util.HashMap;

import com.aash.priceoutapi.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Product>> list() {
    Iterable<Product> someResources = someResourceService.list();
    return createHashPlural(someResources);
  }

  private Map<String, Iterable<Product>> createHashPlural(Iterable<Product> someResources) {
    Map<String, Iterable<Product>> response = new HashMap<String, Iterable<Product>>();
    response.put("products", products);

    return response;
  }
}