package com.SGV.PGJ.Controllers;

import java.security.Principal;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class LoginController {

							
			@RequestMapping(value="/login")
			public String login(Model model,Principal principal, RedirectAttributes flash) {
				
				if(principal != null) {
					flash.addFlashAttribute("info","Ya ha iniciado sesion");
					 
					return "redirect:/";
				}
				return "login";
			}
			
			
		    
}






















