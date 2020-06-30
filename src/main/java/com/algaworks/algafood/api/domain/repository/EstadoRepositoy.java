package com.algaworks.algafood.api.domain.repository;

import java.util.List;

import com.algaworks.algafood.api.domain.model.Cidade;
import com.algaworks.algafood.api.domain.model.Estado;

public interface EstadoRepositoy {

	List<Estado> listar();
	Estado buscar(Long Id);
	Estado salvar(Estado cidade);
	void remover(Estado cidade);
		
	}
	
