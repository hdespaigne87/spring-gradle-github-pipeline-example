package spring.gradle.github.pipeline.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public final class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
