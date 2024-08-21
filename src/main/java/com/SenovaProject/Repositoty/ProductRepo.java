package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
