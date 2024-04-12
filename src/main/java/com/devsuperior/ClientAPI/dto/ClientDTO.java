package com.devsuperior.ClientAPI.dto;

import com.devsuperior.ClientAPI.entities.Client;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Long id, Integer children, LocalDate birthDate, Double income, String cpf, String name) {
        this.id = id;
        this.children = children;
        this.birthDate = birthDate;
        this.income = income;
        this.cpf = cpf;
        this.name = name;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        children = entity.getChildren();
        birthDate = entity.getBirthDate();
        income = entity.getIncome();
        cpf = entity.getCpf();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
