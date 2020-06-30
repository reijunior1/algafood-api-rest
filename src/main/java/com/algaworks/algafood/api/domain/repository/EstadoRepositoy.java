package com.algaworks.algafood.api.domain.repository;

import java.util.List;

import com.algaworks.algafood.api.domain.model.Cidade;

public interface EstadoRepositoy {

	List<Cidade> listar();
	Cidade buscar(Long Id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);
		
	}
	
