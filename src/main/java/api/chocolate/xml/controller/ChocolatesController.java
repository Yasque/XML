package api.chocolate.xml.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.chocolate.xml.domain.Chocolate;
import api.chocolate.xml.service.ChocolateService;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api")
public class ChocolatesController {
	
	@Autowired
	private ChocolateService chocolateService;
	
	
	@GetMapping("/chocolates")
	@ApiOperation(value="Regresa una lista de productos Chocolates")
	public String home(Map <String, Object> model){
		
		List <Chocolate> chocolates = chocolateService.obtenerTodas();
		
		model.put("chocolates", chocolates); //envia informacion a la vista
		
		
		return "home";
	}
	
	@PostMapping("/agrega")
	public String agregarHerramienta(Map <String, Object> model, @RequestParam String nombre,@RequestParam String descripcion,@RequestParam int piezas,@RequestParam String costo,@RequestParam String file) throws Exception{
		Chocolate chocolate = new Chocolate(nombre, costo, file, descripcion,piezas);
		chocolateService.insertarChocolate(chocolate); 
		List <Chocolate> chocolates = chocolateService.obtenerTodas();	
	    model.put("chocolates", chocolates);
		return"home";

	}
	


	
	
	
	

}
