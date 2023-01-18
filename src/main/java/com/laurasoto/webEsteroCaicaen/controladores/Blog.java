package com.laurasoto.webEsteroCaicaen.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blog {
	@GetMapping("/")
	public String home(Model model){
		return "home";
	}
	
	@GetMapping("/origen")
	public String origenPag(Model model){
		return "origen";
	}
	
	@GetMapping("/otroServicio")
	public String otrosServicios(Model model){
		return "otrosServicios";
	}
}
