package by.vadzim13.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrldController {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello MINSK";
    }
}
