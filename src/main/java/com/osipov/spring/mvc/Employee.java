package com.osipov.spring.mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 symbols")
    private String name;
    @NotBlank(message = "Surname is required field")  // Эта аннотация делает то же, что и аннотации NotEmpty и NotNull,
    // но ещё проверяет, чтобы поле не состояло из одних пробелов.
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BWM");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes-Benz");

        languageMap = new LinkedHashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("Deutsch", "DE");
        languageMap.put("French", "FR");
    }
}
