package br.com.enalto.dio.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String mensagem() {
		return "Spring boot";
	}
	

}
