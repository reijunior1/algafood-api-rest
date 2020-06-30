package com.algaworks.algafood.api.domain.repository;

import java.util.List;

import com.algaworks.algafood.api.domain.model.Permissao;

public interface Persmissao {

	List<Permissao> listar();
	Permissao buscar(Long Id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);
	
}
