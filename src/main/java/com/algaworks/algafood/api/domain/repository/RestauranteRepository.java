package com.algaworks.algafood.api.domain.repository;

import java.util.List;

import com.algaworks.algafood.api.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> todos();
	Restaurante porId(Long id);
	Restaurante adicionar(Restaurante cozinha);
	void remover(Restaurante cozinha);

}
