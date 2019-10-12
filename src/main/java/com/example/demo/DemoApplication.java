package com.example.demo;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Coche coche = new Coche();
		Rueda rueda = new Rueda();
		coche.setMarca("Renault");
		coche.setModelo("Clio");
		rueda.setEstado("bueno");
		rueda.setMedida(185);
		rueda.setPerfil(65);
		coche.getListaRuedas().add(rueda);
		
		//
		CocheMapper mapper = Mappers.getMapper(CocheMapper.class);
		cocheConRuedas cocheConRuedas = mapper.cocheConRuedasToCoche(coche, coche.getListaRuedas().get(0));
		System.out.println(cocheConRuedas.toString());
	}

}
