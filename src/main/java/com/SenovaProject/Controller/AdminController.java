package com.SenovaProject.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SenovaProject.Model.Category;
import com.SenovaProject.Repositoty.CategoryRepo;

public class AdminController {

	@Autowired
	private CategoryRepo categoryRepo;

	@RequestMapping("getAllCategories")
	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}

	@RequestMapping("addNewCategory")
	public Category addNewCategory(@RequestBody Object category) {
		Category c = new Category();
		c.setDate(new Date());
		return categoryRepo.save(c);
	}
}
