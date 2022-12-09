package by.vadzim13.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("add/{a}/{b}")
    public Integer add(
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b
    ) {
        return a + b;
    }

    @GetMapping("multiply/{c}/{d}")
    public Integer multiply(
            @PathVariable("c") Integer c,
            @PathVariable("d") Integer d
    ) {
        return c * d;
    }

}














