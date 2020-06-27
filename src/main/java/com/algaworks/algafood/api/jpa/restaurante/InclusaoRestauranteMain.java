package com.algaworks.algafood.api.jpa.restaurante;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.api.AlgafoodApiRestApplication;
import com.algaworks.algafood.api.domain.model.Restaurante;
import com.algaworks.algafood.api.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiRestApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Mexicano");
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Argentino");
		
		restaurante1 = restauranteRepository.adicionar(restaurante1);
		restaurante2 = restauranteRepository.adicionar(restaurante2);
		
		System.out.printf("%d - %s\n", restaurante1.getId(),restaurante1.getNome());
		System.out.printf("%d - %s\n", restaurante2.getId(),restaurante2.getNome());

		
		}
		
	}


