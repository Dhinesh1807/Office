package com.example.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.onetomany.entity.ClientVO;
import com.example.onetomany.repo.ClientRepo;

@Service
public class ClientServiceImpl implements ClientService {
  
	@Autowired
	ClientRepo clientRepo;

	@Override
	public List<ClientVO> getAllClient() {
		return clientRepo.findAll();
	}

	@Override
	public ClientVO getClientById(int id) {
		return clientRepo.findById(id).orElse(null);
	}

	@Override
	public ClientVO createClient(ClientVO clientVO) {
		return clientRepo.save(clientVO);
	}

	@Override
	public ResponseEntity<?> updateClient(int id, ClientVO clientVO) {
		ClientVO client =clientRepo.findById(id).get();
		client.setName(clientVO.getName());
		client.setAddress(clientVO.getAddress());
		client.setEmail(clientVO.getEmail());
		client.setLandmark(clientVO.getLandmark());
		client.setNumber(clientVO.getNumber());
		client.setPincode(clientVO.getPincode());
		client.setProductVO(clientVO.getProductVO());
		clientRepo.save(client);
	    return ResponseEntity.ok().body("Updated Successfully");
	}

	@Override
	public ResponseEntity<?> deleteClient(int id) {
		clientRepo.deleteById(id);
		return ResponseEntity.ok().body("Deleted Successfully");
	}
}
