package com.gestion.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com/gestion/empleados/modelo")
public class GestionEmpleadosBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEmpleadosBackendApplication.class, args);
	}

}
