package com.algaworks.algafood.api.domain.repository;

import java.util.List;

import com.algaworks.algafood.api.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	
	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar (FormaPagamento formaPagamento);
	void remover(FormaPagamento formapamento);
}
