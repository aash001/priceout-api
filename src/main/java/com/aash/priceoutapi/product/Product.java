package com.aash.priceoutapi.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "favorites")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "product_name")
  private String product_name;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "description")
  private String description;

  @Column(name = "product_link")
  private String productlink;
}