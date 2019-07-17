package com.SGV.PGJ.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosController {

	
	@GetMapping ({"/Usuarios"})
	public String usuarios() {
						
		return "Usuarios";		
	}

}
