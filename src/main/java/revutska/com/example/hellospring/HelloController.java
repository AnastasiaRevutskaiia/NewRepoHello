package revutska.com.example.hellospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;


@RestController
@PropertySource("${classpath:application.yml}")
public class HelloController {

    @Value("${hello-controller.prefix}")
    private String prefix;

    @Value("${hello-controller.suffix}")
    private String suffix;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable(name="name") String name) {
        return prefix + name + suffix;
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return getHello("World");
    }
}
