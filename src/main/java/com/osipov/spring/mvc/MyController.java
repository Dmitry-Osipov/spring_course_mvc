package com.osipov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;  // Для Tomcat 10 требуется Jakarta Servlet. С Tomcat 9 Jakarta Servlet
// не взаимодействует

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
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
        // Добавили 2 обязательных параметра: имя сотрудника и модель. Имя сотрудника привязано строго к передаваемому
        // полю html-файла (в данном случае employeeName). Таким образом, извлечение имени происходит под капотом, а
        // мы работаем уже готовым значением.
        empName = "Mr. " + empName + "!";
        model.addAttribute("nameAttribute", empName);  // Добавляем изменённое имя в качестве атрибута в модель.
        // Указываем название атрибута + значение.

        return "show-emp-details-view";
    }
}
