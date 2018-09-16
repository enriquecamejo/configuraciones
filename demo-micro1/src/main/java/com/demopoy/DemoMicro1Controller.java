package com.demopoy;



import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoMicro1Controller {

	@Value("${spring.port}")
    private String prop;
	
	protected Logger logger = Logger.getLogger(DemoMicro1Controller.class.getName());
	
	@RequestMapping("/params")	
	public String parametros() {
		
		logger.info("valor: " + prop);
		
		return prop;
	}
	
	
}

