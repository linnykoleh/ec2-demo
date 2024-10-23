package demo.ec2demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class CreateUserRestController {

    int id = new Random().nextInt(10000);

    @GetMapping("/")
    public String home() {
        return "Hello from " + id;
    }

}
