package br.com.drummond.resources;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ac2Resources {
	
	@RequestMapping(value = "/soma/{valor1}/{valor2}", method = RequestMethod.GET)
	public Integer soma(@PathVariable Integer valor1, @PathVariable Integer valor2) {
		
		Integer Resultado;
		Resultado = valor1 + valor2;
		
		return Resultado;
		
		
		
	}

}
