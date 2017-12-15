package api.chocolate.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Application {

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
  
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/chocolates").allowedOrigins("http://localhost");
			}
		};
	}
	
}
