package com.bookstore.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookstore.api.controllers.PurchaseController;
import com.bookstore.api.models.BookPurchase;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class PurchaseControllerTest {

    @Autowired
    PurchaseController purchaseController;

    @Test
    public void getPurchaseTest() {
        BookPurchase registeredBookPurchase = purchaseController.createPurchase(new BookPurchase());
        assertTrue(purchaseController.getPurchase().contains(registeredBookPurchase));
    }

    @Test
    public void createPurchaseTest() {
        BookPurchase purchaseModel = new BookPurchase();
        BookPurchase purchaseResponse = purchaseController.createPurchase(new BookPurchase());
        purchaseModel.setId(Long.parseLong("1"));
        assertEquals(purchaseModel.getId().getClass().getSimpleName(), purchaseResponse.getId().getClass().getSimpleName());
        assertEquals(purchaseModel.getClass().getSimpleName(), purchaseResponse.getClass().getSimpleName());
    }
}
