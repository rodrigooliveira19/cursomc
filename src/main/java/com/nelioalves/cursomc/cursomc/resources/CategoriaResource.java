package com.nelioalves.cursomc.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.cursomc.domain.Categoria;

@RestController //Define a classe como um Controlador Rest
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "INFORMATICA"); 
		Categoria cat2 = new Categoria(2, "ESCRITORIO"); 
		
		List<Categoria> lista = new ArrayList(); 
		lista.add(cat1); 
		lista.add(cat2); 
		
		return lista; 
	}

}
