package com.algaworks.algafood.api.jpa;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.api.AlgafoodApiRestApplication;
import com.algaworks.algafood.api.domain.model.Cozinha;

public class InclusaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiRestApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		cozinha1 = cadastroCozinha.adicionar(cozinha1);
		cozinha2 = cadastroCozinha.adicionar(cozinha2);
		
		System.out.printf("%d - %s\n", cozinha1.getId(),cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(),cozinha2.getNome());

		
		}
		
	}


