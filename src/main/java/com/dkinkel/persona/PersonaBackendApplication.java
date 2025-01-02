package com.dkinkel.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PersonaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaBackendApplication.class, args);
	}
	
	
	// AGREGAR EXPLICACION
//	WebMvcConfigurer: Esta interfaz permite personalizar la configuración de Spring MVC.
//	addCorsMappings: Este método se utiliza para definir las configuraciones de CORS.
//
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Esto indica que se permiten solicitudes CORS a cualquier ruta de tu API.
						.allowedOrigins("http://localhost:4200") //Permite solicitudes solo desde http://localhost:4200
						.allowedMethods("*") // Permite todos los métodos HTTP (GET, POST, PUT, DELETE, etc.).
						.allowedHeaders("*"); //Permite todos los encabezados en las solicitudes.
			}
		};
	}

}
