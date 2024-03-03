package com.osipov.spring.mvc;

import com.osipov.spring.mvc.validation.CheckEmail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 symbols")  // Аннотация указывает размер. Возможные параметры: min,
    // max, message.
    private String name;
    @NotBlank(message = "Surname is required field")  // Эта аннотация делает то же, что и аннотации NotEmpty и NotNull,
    // но ещё проверяет, чтобы поле не состояло из одних пробелов.
    private String surname;
    @Min(value = 500, message = "Must be greater than 499")
    @Max(value = 1000, message = "Must be less than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageMap;
    @Pattern(regexp = "\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern +7(XXX)XXX-XX-XX")  // Эта
    // аннотация с регулярным выражением указывает, какой шаблон должен быть использован.
    private String phoneNumber;
    @CheckEmail(value = "@abc.com", message = "Email must ends with @abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes-Benz");

        languageMap = new LinkedHashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("Deutsch", "DE");
        languageMap.put("French", "FR");
    }
}
