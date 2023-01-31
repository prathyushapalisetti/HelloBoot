package SpringHello.demohelloBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BootController {
		@RequestMapping("/HelloWorld")
		public String HelloWorld() {
			return "HelloWorld";
		}
	}


