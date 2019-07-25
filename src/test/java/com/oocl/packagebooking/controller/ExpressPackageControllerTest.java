package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.ExpressPackageRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class ExpressPackageControllerTest {

//    @Autowired
//    private MockMvc mockMvc;

//    @MockBean
//    private ExpressPackageRepository expressPackageRepository;

//    @Test
//    @DirtiesContext
//    public void should_return_packages_when_call_findAllPackage_get_all_packages() throws Exception {
//
//            // GIVEN
//            ExpressPackageController expressPackageController = new ExpressPackageController();
//
//            // WHEN
//            String status = expressPackageController;
//
//            // THEN
//            Assertions.assertEquals("Hello world", helloWorld);
//
//    }
}
