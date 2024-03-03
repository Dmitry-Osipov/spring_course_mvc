package com.osipov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CheckEmailValidator.class)  // Указываем класс, который будет обрабатывать аннотацию.
public @interface CheckEmail {
    String value() default "@xyz.com";
    String message() default "Email must ends with @xyz.com";
    // Параметры ниже просто нужно вписывать в аннотацию, чтобы всё верно работало.
    // Достаточно это просто копировать и вставлять для каждой аннотации.
    Class<?>[] groups() default {};  // Позволяет программистам разбивать аннотации по группам.
    Class<? extends Payload>[] payload() default {};  // Используется для переноса информации о метаданных клиента.
}
