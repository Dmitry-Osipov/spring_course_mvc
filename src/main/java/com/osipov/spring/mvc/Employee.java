package com.osipov.spring.mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private Departments department;
    private String carBrand;
    private Map<String, String> carBrands;

    public Employee() {
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BWM");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes-Benz");
    }
}
