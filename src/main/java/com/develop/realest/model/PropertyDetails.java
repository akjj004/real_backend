package com.develop.realest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PropertyDetails {
    private int yearBuilt;
    private boolean garage;
    private boolean pool;
}
