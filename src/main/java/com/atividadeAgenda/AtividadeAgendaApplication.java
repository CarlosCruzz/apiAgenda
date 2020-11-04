package com.atividadeAgenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.atividadeAgenda.domain.Contato;

@SpringBootApplication
public class AtividadeAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeAgendaApplication.class, args);
		/*
		Contato cont = new Contato ();
		cont.setNome("Carlos Junio Pereira da Cruz");
		cont.setEmail("carloscruz1958@hotmail.com");
		cont.setTelefone("31982085912");*/
	}

}
