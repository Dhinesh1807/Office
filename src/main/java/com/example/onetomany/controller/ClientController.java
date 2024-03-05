package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.entity.ClientVO;
import com.example.onetomany.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {
 @Autowired
 ClientService clientService;
 
@GetMapping("/client")
public List<ClientVO> getAllClient(){
	return clientService.getAllClient();
}

@GetMapping("/client/{id}")
public ClientVO getByIdClient(@PathVariable int id) {
	return clientService.getClientById(id);
}
	
@PostMapping("/client")
public ClientVO createClient(@RequestBody ClientVO clientVO) {
 return clientService.createClient(clientVO);
}

@PutMapping("/client/{id}")
public ResponseEntity<?> updateClient(@PathVariable int id, @RequestBody ClientVO clientVO){
	clientService.updateClient(id, clientVO);
	return ResponseEntity.ok().body("Updated successfully");
}

@DeleteMapping("/client/{id}")
     public ResponseEntity<?> deleteClient(@PathVariable int id){
	clientService.deleteClient(id);
	return ResponseEntity.ok().body("Deleted Successfully");
	
}
}
