package com.donnu.laba1.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class Laba1v1Application {
    public static void main(String[] args) {
        SpringApplication.run(Laba1v1Application.class, args);
    }

    // http://localhost:8080/hello
    // http://localhost:8080/hello?myName=Artem
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    // http://localhost:8080/about
    @GetMapping("/about")
    public String sayAboutUs() {
        return "about us";
    }

    // http://localhost:8080/options
    // http://localhost:8080/options?myOptions=Artem
    @GetMapping("/options")
    public  String sayOptions(@RequestParam(value = "myOptions", defaultValue = "options") String option) {
        if (!Objects.equals(option, "options")) {
            return ("not an option");
        }
        return option;
    }
}
