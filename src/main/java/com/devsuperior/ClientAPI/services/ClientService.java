package com.devsuperior.ClientAPI.services;

import com.devsuperior.ClientAPI.dto.ClientDTO;
import com.devsuperior.ClientAPI.entities.Client;
import com.devsuperior.ClientAPI.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;
    
    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
}
