package com.osipov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import javax.servlet.http.HttpServletRequest;  // Для Tomcat 10 требуется Jakarta Servlet. С Tomcat 9 Jakarta Servlet
// не взаимодействует. P.s.: если мы хотим использовать HttpServletRequest.

@Controller
@RequestMapping("/employee")  // Аннотация используется для маппинга адреса, который мы будем вводить в браузере.
// Также @RequestMapping, указанный для контроллера связывает URL со всеми его методами. Т.е. теперь отображение первой
// страницы будет по ссылке http://localhost:8080/spring_course_mvc/employee/ (было:
// http://localhost:8080/spring_course_mvc/). Такое указание аннотации называется ControllerMapping.
// Т.е. если мы хотим добавить для всех методов контроллера одно и то же начало URL, то не нужно писать это над всеми
// методами, достаточно указать это над контроллером.
public class MyController {
    @RequestMapping("/")  // Аннотация используется для маппинга адреса, который мы будем вводить в браузере, с
    // методом. Т.е. при вводе в браузере "/" будет отображаться view с названием first-view. Такое указание аннотации
    // называется MethodMapping. Важно: в MethodMapping-ах требуется указывать уникальные URL. Иначе вылетит ошибка
    // IllegalStateException.
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
