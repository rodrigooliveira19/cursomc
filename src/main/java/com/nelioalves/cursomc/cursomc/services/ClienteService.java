package com.nelioalves.cursomc.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.cursomc.domain.Cliente;
import com.nelioalves.cursomc.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	//@Autowired instancia um obj automaticamente pelo spring. 
	@Autowired
	private ClienteRepository repo; 
	
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				      "Objeto Não encontrado! "+"id: "+id +", Tipo: "+ Cliente.class.getName())) ; 
		
	}

}
