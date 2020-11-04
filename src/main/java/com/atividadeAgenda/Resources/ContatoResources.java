package com.atividadeAgenda.Resources;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeAgenda.domain.Contato;
import com.atividadeAgenda.repository.ContatoRepository;

@CrossOrigin
@RestController
@RequestMapping("/contato")
public class ContatoResources {
		
		@Autowired
		ContatoRepository repo;
		
		
		@PostMapping ("/salvar")
		public String  salvar (@RequestBody Contato contato) {
			
			this.repo.save(contato);
			
			return "Salvo com sucesso";
			
		}
		
		@GetMapping("/listar")
		public List<Contato> listar(){
			
			return repo.findAll();
			
		}
		@DeleteMapping("/deletar")
		public String deletar () {
			
			repo.deleteAll();
			
			return "deletado com sucesso";
		}

}
