package com.develop.realest.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "properties")
@Getter
@Setter
public class Property {
    @Id
    private String id;
    private Address address;
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;
    private int price;
    private int rooms;
    private PhoneNumbers phoneNumbers;
    private String title;
    private String contactName;
    private String furnishingStatus;
    private Boolean isVerified;
    private List<Category> category;
    private PropertyDetails details;
    private List<String> images;
    private Location location;
    private List<Amenity> nearestAmenities;


    public Property(Address address, int squareFootage, int bedrooms, int bathrooms, int price, int rooms, PhoneNumbers phoneNumbers, String title, String contactName, String furnishingStatus, Boolean isVerified, List<Category> category, PropertyDetails details, List<String> images, Location location, List<Amenity> nearestAmenities) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
        this.rooms = rooms;
        this.phoneNumbers = phoneNumbers;
        this.title = title;
        this.contactName = contactName;
        this.furnishingStatus = furnishingStatus;
        this.isVerified = isVerified;
        this.category = category;
        this.details = details;
        this.images = images;
        this.location = location;
        this.nearestAmenities = nearestAmenities;
    }
}