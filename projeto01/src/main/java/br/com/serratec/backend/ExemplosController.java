package br.com.serratec.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") // único requestmapping para todos os métodos desta classe, não 1 para cada
public class ExemplosController {
	
	@GetMapping("/teste")
	public String teste() {
		return "Aula 02";
	}
	
	@GetMapping("/teste2")
	public String teste2() {
		return "Aula de Rest";
	}
	
	@GetMapping("/converter")
	public String converter(@RequestParam String texto) {
		return texto.toUpperCase();
		// testar -> http://localhost:8080/api/v1/converter?texto=Weridiana
		// ou -->  http://localhost:8080/api/v1/converter?texto=Weridiana&texto=MARIA
	}
	
}
