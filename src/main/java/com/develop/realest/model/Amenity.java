package com.develop.realest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Amenity {
    private String name;
    private double distance;
    private String type;


}
