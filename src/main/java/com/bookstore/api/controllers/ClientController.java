package com.bookstore.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.api.models.Client;
import com.bookstore.api.repository.ClientRepository;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

}
