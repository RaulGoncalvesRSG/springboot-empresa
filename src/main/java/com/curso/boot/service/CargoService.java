package com.curso.boot.service;

import java.util.List;

import com.curso.boot.model.Cargo;
import com.curso.boot.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	public PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
