package com.iskandev.week3project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String printHelloWorld(Model model) {
        model.addAttribute("name", "World");
        return "hello";
    }

    @GetMapping("/hello")
    public String printHelloToPerson(Model model, @RequestParam(name = "name", defaultValue = "")
            String name)
    {
        model.addAttribute("name", name.isBlank() ? "World" : name);
        return "hello";
    }

    @GetMapping("/input_name")
    public String printInputNameForm() {
        return "input_name";
    }

    @PostMapping("/submit_name")
    public RedirectView updateName(@RequestParam(name = "name") String name) {
        return new RedirectView("/hello?name=" + name);
    }
}
