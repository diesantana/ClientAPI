package com.devsuperior.ClientAPI.repositories;

import com.devsuperior.ClientAPI.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
