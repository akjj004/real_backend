package com.develop.realest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class PropertyDetails {
    private int yearBuilt;
    private boolean garage;
    private boolean pool;

}
