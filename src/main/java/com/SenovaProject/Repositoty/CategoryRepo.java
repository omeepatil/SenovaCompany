package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	
}
