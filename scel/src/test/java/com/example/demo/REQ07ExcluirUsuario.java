package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Livro;
import com.example.demo.model.LivroRepository;
import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioRepository;

class REQ07ExcluirUsuario {
	@Autowired
	UsuarioRepository repository;
	/**
	* Verificar o comportamento da classe UsuarioRepository
	*/
	@Test
	public void CT01ExcluirUsuarioComSucesso() {
	repository.deleteAll();
	Usuario usuario = new Usuario("3333", "Jorge", "jorge.mendes@fatec.sp.gov.br","04280-130","R. Frei João, 59 - Ipiranga, São Paulo - SP");
	repository.save(usuario);
	Usuario ro = repository.findByRa("3333");
	repository.deleteById(ro.getId());
	assertThat(repository.findByRa("3333")).isEqualTo(null);
	}
}
