package ru.complexhex.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }

    @GetMapping("/page")
    public String newPage(){
        return "page";
    }
}
