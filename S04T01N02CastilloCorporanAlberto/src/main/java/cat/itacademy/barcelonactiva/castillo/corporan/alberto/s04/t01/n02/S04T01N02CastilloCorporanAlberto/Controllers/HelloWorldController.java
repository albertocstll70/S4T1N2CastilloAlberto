package cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t01.n02.S04T01N02CastilloCorporanAlberto.Controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")

public class HelloWorldController {
	
	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public String saluda(@RequestParam(value="nombre",required=false, defaultValue="UNKNOWN") String nombre) {
		return "Hola, " + nombre + " Estás ejecutando un proyecto Gradle";
	}

	@GetMapping(value ={"/HelloWorld2","/HelloWorld2/{nombre}"})
	@ResponseBody
	public String saluda2(@PathVariable(required=false) Optional<String> nombre) {
		
		return "Hola, " + nombre.orElse("UNKNOWN") + " Estás ejecutando un proyecto Gradle";
		
	}

}
