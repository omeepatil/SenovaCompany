package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
