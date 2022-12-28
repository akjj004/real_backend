package com.develop.realest;

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

//    @Bean
//    CommandLineRunner runner(PropertyRepository repository) {
//        return  args -> {
//            Address address = new Address("123 Main St","New York","NY","10001");
//            PropertyDetails details = new PropertyDetails(2010,true,false);
//            Location location = new Location(40.7128, -74.0060);
//            Amenity amenity = new Amenity("school",0.5,"school");
//            Property property = new Property(
//                address,
//                    2000,
//                    3,
//                    2,
//                    5000,
//                    details,
//                    List.of("Images"),
//                    location,
//                    List.of(amenity)
//            );
//            repository.insert(property);
//        };
//    }

}
