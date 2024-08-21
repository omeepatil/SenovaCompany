package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
