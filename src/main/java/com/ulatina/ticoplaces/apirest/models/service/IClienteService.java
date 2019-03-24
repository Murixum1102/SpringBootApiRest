package com.ulatina.ticoplaces.apirest.models.service;

import com.ulatina.ticoplaces.apirest.models.entity.Cliente;

import antlr.collections.List;

public interface IClienteService {

	public java.util.List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
