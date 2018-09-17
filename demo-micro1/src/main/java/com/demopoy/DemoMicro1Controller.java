package com.demopoy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoMicro1Controller {

	@Value("${solucion.id}")
    private String idSI;
	
	@RequestMapping("/solucion")	
	public String parametros() {
		
		System.out.printf("valor SI: %s\n",idSI);
		
		return idSI;
	}
	
	
}

