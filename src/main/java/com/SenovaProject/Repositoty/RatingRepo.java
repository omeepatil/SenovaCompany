package com.SenovaProject.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SenovaProject.Model.Rating;

public interface RatingRepo extends JpaRepository<Rating, Integer> {

}
