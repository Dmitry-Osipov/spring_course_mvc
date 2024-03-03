package com.osipov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {  // В дженериках указали:
    // 1) Наша аннотация, которую будет обрабатывать валидатор;
    // 2) Тип данных, к которому будем применять аннотацию.
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        endOfEmail = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(endOfEmail);
    }
}
