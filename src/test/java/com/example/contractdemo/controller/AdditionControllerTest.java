package com.example.contractdemo.controller;

import com.example.contractdemo.ContractDemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = ContractDemoApplication.class)
@AutoConfigureMockMvc
class AdditionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void additionEndpointReturnsContractResponse() throws Exception {
        mockMvc.perform(get("/ms1/add").param("a", "5").param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string("MS 1.1 - Addition = 15"));
    }

    @Test
    void additionEndpointAddsOtherNumbers() throws Exception {
        mockMvc.perform(get("/ms1/add").param("a", "7").param("b", "8"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Addition = 15"));
    }
}
