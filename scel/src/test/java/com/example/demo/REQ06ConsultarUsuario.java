package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioRepository;

@RunWith(SpringRunner.class)
/*
 * teste
 */
@SpringBootTest
class REQ06ConsultarUsuario {
	
	
	@Autowired
	UsuarioRepository repository ;
	static Usuario usuario;
	@Test
	public void CT01ConsultaUsuario_com_sucesso() {
	// dado que nao existem usuarios cadastrados
	Usuario usuario = new Usuario("3333", "Jorge", "jorge.mendes@fatec.sp.gov.br","04280-130","R. Frei João, 59 - Ipiranga, São Paulo - SP");
	repository.save(usuario);
	//quando o usuario consulta por ra
	Usuario ro = repository.findByRa("3333");
	//entao
	assertThat(ro).isEqualTo(usuario);
	}
}