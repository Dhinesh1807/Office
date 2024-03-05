package com.example.onetomany.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.onetomany.entity.ClientVO;

@Service
public interface ClientService { 
	List<ClientVO> getAllClient();
	ClientVO getClientById(int id);
	ClientVO createClient(ClientVO clientVO);
	ResponseEntity<?> updateClient(int id,ClientVO clientVO);
	ResponseEntity<?> deleteClient(int id);

}
