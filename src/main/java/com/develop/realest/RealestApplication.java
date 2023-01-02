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
//            PropertyDetails details = new PropertyDetails(2010,true,false);
//            Location location = new Location(40.7128, -74.0060);
            Amenity amenity = new Amenity("school",0.5,"school");
            PhoneNumbers phoneNumbers = new PhoneNumbers("+971589159379","+971589159379","971589159379");
            Images images = new Images("MyImage", "https://images.unsplash.com/photo-1523217582562-09d0def993a6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2680&q=80");
            Property property =  new Property(
                    address,
                    2000,
                    3,
                    2,
                    5000,
                    2,
                    phoneNumbers,
                    "Amazing and cosy 1 Bedroom big apartment with Wi-Fi",
                    "Jhon Titor",
                    "furnished",
                    true,
                    1,
                    "RARE Opportunity to Build a resort on the Palm Jumeirah with beach access and panoramic sea view You can build 7 floors resort mixed between hotel or hotel apartments What the benefits what is the construction cost what is the approximate income for the hotel what is the value of the hotel after completion If you are an investor or International investment company, contact us for full presentation and ready business plan for this opportunity *Note: The pictures is sample of what you can build on this plot at the same area location Ayham Jbara Manzel Kareem",
                    List.of(images),
                    1,
                    List.of(amenity)
            );

            repository.insert(property);
        };
    }

}
