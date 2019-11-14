package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Livro;
import com.example.demo.model.LivroRepository;
import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioRepository;



@RunWith(SpringRunner.class)
/*
 * teste
 */
@SpringBootTest
class REQ05CadastrarUsuario {
	@Autowired
	UsuarioRepository repository;

	@Test
	public void CT01CadastrarUsuarioComSucesso() {
		// dado que o isbn nao esta cadastrado
		repository.deleteAll();
		// quando o usurio inclui as informacoes obrigatorias e confirma a operacao
		Usuario usuario = new Usuario("3333", "Jorge", "jorge.mendes@fatec.sp.gov.br","04280-130","R. Frei João, 59 - Ipiranga, São Paulo - SP");
		repository.save(usuario);
		// entao
		assertEquals(1, repository.count());
		}

}
