package api.chocolate.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("inicio");
		
		registry.addViewController("/agregar").setViewName("agregar");
		registry.addViewController("/acercaDe").setViewName("acercaDe");
		//registry.addViewController("/modificar").setViewName("modificar");
		//registry.addViewController("/modificando").setViewName("modificando");
		
		
		
		
		
	}

}


/*registry.addViewController("/login").setViewName("login");
//home y pagina inicial
registry.addViewController("/").setViewName("login");
//esto se usa para saber si se necesita seguridad
registry.addViewController("/index.html");
registry.addViewController("/alumnos.html");
registry.addViewController("/inventario.html");
registry.addViewController("/pedido.html");
registry.addViewController("/contacto.html");
*/