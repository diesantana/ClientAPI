package com.devsuperior.ClientAPI.controllers;

import com.devsuperior.ClientAPI.dto.ClientDTO;
import com.devsuperior.ClientAPI.entities.Client;
import com.devsuperior.ClientAPI.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    
    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        Page<ClientDTO>  result = service.findAll(pageable);
        return ResponseEntity.ok(result);
    }
}
