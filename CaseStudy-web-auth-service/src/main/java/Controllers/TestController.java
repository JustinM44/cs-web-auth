package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
}
