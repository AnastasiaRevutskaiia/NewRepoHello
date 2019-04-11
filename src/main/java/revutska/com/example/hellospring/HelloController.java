package revutska.com.example.hellospring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String getNameHelloVariable(@PathVariable(name="name") String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping("/hello")
    public String getNameHelloParam(@RequestParam(name="name", required = true) String name) {
        return "Hello " + name + "!";
    }
}
