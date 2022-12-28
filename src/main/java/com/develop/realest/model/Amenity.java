package com.develop.realest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Amenity {
    private String name;
    private double distance;
    private String type;
}
