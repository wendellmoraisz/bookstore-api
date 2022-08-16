package com.bookstore.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookstore.api.controllers.SaleController;
import com.bookstore.api.models.Sale;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class SaleControllerTest {

    @Autowired
    SaleController saleController;

    @Test
    public void getSalesTest() {
        assertEquals(new ArrayList<Sale>().getClass().getSimpleName(), saleController.getSales().getClass().getSimpleName());
    }

    @Test
    public void createPurchaseTest() {
        Sale saleModel = new Sale();
        Sale saleResponse = saleController.createSale(new Sale());
        saleModel.setId(Long.parseLong("1"));
        assertEquals(saleModel.getId().getClass().getSimpleName(), saleResponse.getId().getClass().getSimpleName());
        assertEquals(saleModel.getClass().getSimpleName(), saleResponse.getClass().getSimpleName());
    }
}
