package com.michelpessoa.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.michelpessoa.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResouces {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> listaCategoria = new ArrayList<>();
		
		listaCategoria.add(cat1);
		listaCategoria.add(cat2);
		
		return listaCategoria;
	}
}
