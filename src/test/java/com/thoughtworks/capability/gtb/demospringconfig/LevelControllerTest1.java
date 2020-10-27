package com.thoughtworks.capability.gtb.demospringconfig;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("classpath:levelNumber1.properties")
public class LevelControllerTest1 {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_basic_when_levelNumber_is_less_than_1() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(content().string("basic"));
    }
}
