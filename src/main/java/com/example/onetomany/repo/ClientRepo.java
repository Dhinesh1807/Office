package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.ClientVO;

@Repository
public interface ClientRepo extends JpaRepository<ClientVO, Integer>{

}
