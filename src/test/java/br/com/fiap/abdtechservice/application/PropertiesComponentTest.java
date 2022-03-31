package br.com.fiap.abdtechservice.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesComponentTest {

    private PropertiesComponent propertiesComponent;

    @BeforeEach
     void setUp(){
        propertiesComponent= new PropertiesComponent();
     }
    @Test
     void testingGetName(){
         Assertions.assertNotNull(propertiesComponent.getName());

     }

    @Test
    void testingGetVersion(){
        Assertions.assertNotNull(propertiesComponent.getVersion());
    }
}