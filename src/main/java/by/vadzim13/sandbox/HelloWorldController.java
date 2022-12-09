package by.vadzim13.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello Minsk, good bye Moscow!";
    }
}
