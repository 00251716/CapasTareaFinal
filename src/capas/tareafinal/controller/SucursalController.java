package capas.tareafinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SucursalController {
	
	@GetMapping("/sucursales")
	public String initMain(){
		return "main";
	}
}
