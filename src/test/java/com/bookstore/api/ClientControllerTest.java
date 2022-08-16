package com.bookstore.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookstore.api.controllers.ClientController;
import com.bookstore.api.models.Client;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ClientControllerTest {

    @Autowired
    ClientController clientController;

    @Test
    public void getClientsTest() {
        Client registeredClient = clientController.registerClient(new Client());
        assertTrue(clientController.getClients().contains(registeredClient));
    }

    @Test
    public void registerClientTest() {
        Client clientModel = new Client();
        Client clientResponse = clientController.registerClient(new Client());
        clientModel.setId(Long.parseLong("999"));
        assertEquals(clientModel.getId().getClass().getSimpleName(), clientResponse.getId().getClass().getSimpleName());
    }
}
