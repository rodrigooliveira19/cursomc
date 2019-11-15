package com.nelioalves.cursomc.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.cursomc.domain.Categoria;
import com.nelioalves.cursomc.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	//@Autowired instancia um obj automaticamente pelo spring. 
	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				      "Objeto Não encontrado! "+"id: "+id +", Tipo: "+ Categoria.class.getName())) ; 
		
	}

}
