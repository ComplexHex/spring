package ru.complexhex.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.awt.SunHints;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        System.out.println(name + " " + surname);
//        model.addAttribute("message", name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }


    @GetMapping("/calculator")
    public String doCalculate(@RequestParam(value = "a") int a,
                              @RequestParam(value = "b") int b,
                              @RequestParam(value = "action") String action,
                              Model model) {
        int i = 0;
        switch (action) {
            case "multi":
                i = a * b;
                break;

            case "add":
                i = a + b;
                break;
        }


        model.addAttribute("calc", i);

        return "first/calculator";
    }
}
