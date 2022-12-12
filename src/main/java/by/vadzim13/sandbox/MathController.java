package by.vadzim13.sandbox;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("add/{a}/{b}")

    public ResponseEntity<String> add(@PathVariable("a") String a, @PathVariable("b") String b) {

        if (!isValid(a)) {
            return ResponseEntity.badRequest().body("Parameter a should be a number but '" + a +"' is recieved");
        }
        if (!isValid(b)) {
            return ResponseEntity.badRequest().body("Parameter a should be b number but '" + b + "' is recieved");
        }
        Integer aInt = Integer.parseInt(a);
        Integer bInt = Integer.parseInt(b);

        Integer sum = aInt + bInt;
        return ResponseEntity.ok(sum.toString());
    }

    private boolean isValid(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }

        }
        return true;
    }
    @GetMapping("multiply/{c}/{d}")
    public Integer multiply(@PathVariable("c") Integer c, @PathVariable("d") Integer d) {
        return c * d;
    }

}















