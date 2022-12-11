package by.vadzim13.sandbox;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/math")
public class MathController {
    private int x;
    private int y;


    @GetMapping("add/{a}/{b}")
    public static String add(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) }

    ) {
        String word = a + b;
        boolean isOnlyDigits = true;
        for (int i = 0; i < word.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(word.charAt(i))) {
                isOnlyDigits = false;
                return String.valueOf(new ResponseEntity<>("Parameter a should be a number but 'no' is recieved",
                        HttpStatus.BAD_REQUEST));
            }
        }

        // return b + a;

       // public Integer sum (Integer x = Integer.parseInt(a), Integer y = Integer.parseInt(b));
        // return x + y;
        //return word;
        Integer a;

    }


    @GetMapping("multiply/{c}/{d}")
    public Integer multiply(
            @PathVariable("c") Integer c,
            @PathVariable("d") Integer d
    ) {
        return c * d;
    }

}















