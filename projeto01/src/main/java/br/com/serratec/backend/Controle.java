package br.com.serratec.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
	
	//@RequestMapping(value = "/ola", method = RequestMethod.GET, produces = ("aplication/json")) // gera arquivo json
	//public String hello() {
	//	return "Olá Mundo";
	//}
	
	@RequestMapping("/msg")
	public String msg() {
		return "API";
	}

}
