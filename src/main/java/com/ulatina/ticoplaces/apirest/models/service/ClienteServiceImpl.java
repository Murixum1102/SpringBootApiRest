package com.ulatina.ticoplaces.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulatina.ticoplaces.apirest.models.dao.IClienteDao;
import com.ulatina.ticoplaces.apirest.models.entity.Cliente;

//componente de servicio de spring, Bean inyectable
//
@Service
public class ClienteServiceImpl implements IClienteService{

	//inyecta cliente dao utilizando la interfaz dentro contenedor spring
	@Autowired
	private IClienteDao clienteDao;
	@Override
	//se puede omitir esta anotación porque la Clase CrudRepository viene transaccional
	//explicit
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}
