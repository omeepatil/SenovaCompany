package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
