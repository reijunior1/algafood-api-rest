package com.algaworks.algafood.api.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar() {
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}
	
}
