package testcom.example.firsttest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @RequestMapping("/welcome")
    public String helloWorld(){
        return "hello world";
    }

}
