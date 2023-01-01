package com.develop.realest;

import com.develop.realest.model.*;
import com.develop.realest.repository.PropertyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RealestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealestApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PropertyRepository repository) {
        return  args -> {
            Address address = new Address("123 Main St","New York","NY","10001");
            PropertyDetails details = new PropertyDetails(2010,true,false);
            Location location = new Location(40.7128, -74.0060);
            Amenity amenity = new Amenity("school",0.5,"school");
            PhoneNumbers phoneNumbers = new PhoneNumbers("+971589159379","+971589159379","971589159379");
            Category category = new Category("Apartment");
            Property property =  new Property(
                    address,
                    2000,
                    3,
                    2,
                    5000,
                    2,
                    phoneNumbers,
                    "Big offer !!! . . Amazing and cosy 1 Bedroom big apartment with Wi-Fi",
                    "Jhon Titor",
                    "furnished",
                    true,
                    List.of(category),
                    details,
                    List.of("https://images.unsplash.com/photo-1523217582562-09d0def993a6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2680&q=80",
                            "https://images.unsplash.com/photo-1511452885600-a3d2c9148a31?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1921&q=80",
                            "https://images.unsplash.com/photo-1570736388063-a4d795964f9e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1267&q=80"),
                    location,
                    List.of(amenity)
            );

            repository.insert(property);
        };
    }

}
