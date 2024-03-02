package com.osipov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")  // Аннотация используется для маппинга адреса, который мы будем вводить в браузере, с
    // методом. Т.е. при вводе в браузере "/" будет отображаться view с названием first-view.
    public String showFirstView() {  // Сам метод может называться абсолютно как угодно, но лучше указывать осмысленные
        // названия. У метода могут быть параметры. Также и return-type может быть другим, но наиболее часто используют
        // именно String для возврата названия view.
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails() {
        return "show-emp-details-view";
    }
}
