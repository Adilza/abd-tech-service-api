package br.com.fiap.abdtechservice.application;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class PropertiesComponent {
    public Properties  properties;



    public PropertiesComponent(){
        properties=new Properties();
        InputStream inputStream= getClass().getClassLoader().getResourceAsStream( "application.yml");
        try {
            properties.load(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String getName(){
        return properties.getProperty("build.name");
    }

    public String getVersion(){
        return properties.getProperty("build.version");
    }
}
