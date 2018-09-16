package com.demopoy;

//import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoMicro1Controller {

	//@Value("${solucion.id}")
    private String idSI;
	
	//protected Logger logger = Logger.getLogger(DemoMicro1Controller.class.getName());
	
	@GetMapping("/solucion")	
	public String parametros() {
		
		System.out.printf("valor SI: %s",idSI);
		//logger.info("valor: " + prop);
		
		return idSI;
	}
	
	
}

