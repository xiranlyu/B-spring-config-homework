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
@TestPropertySource("classpath:levelNumber2.properties")
public class LevelControllerTest2 {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_advanced_when_levelNumber_is_equal_to_1() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(content().string("advanced"));
    }
}
