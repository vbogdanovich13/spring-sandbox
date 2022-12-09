package by.vadzim13.sandbox;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/math")
public class MathController {
    @GetMapping("/math/add/{a:\\d+}/{b:\\d+}")
    public Integer Add (@PathParam(value = "a") Integer a, @PathParam(value = "b") Integer b) {
       return a + b;
    }

}














