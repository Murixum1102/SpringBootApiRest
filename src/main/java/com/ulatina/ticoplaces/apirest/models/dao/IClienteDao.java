package com.ulatina.ticoplaces.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ulatina.ticoplaces.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
}
