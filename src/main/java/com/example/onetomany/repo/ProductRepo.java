package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.ProductVO;

@Repository
public interface ProductRepo extends JpaRepository<ProductVO, Integer>{

}
