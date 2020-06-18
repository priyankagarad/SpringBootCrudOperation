package com.bl.demo.greeting.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetingservice")
public class EmployeeController {
    @RequestMapping("/welcomemessage")
    public String getGreetingMessage(){
        return "welcome to this Spring boot project";
    }
}
