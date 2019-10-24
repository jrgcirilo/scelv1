package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.model.Livro;
import com.example.demo.model.LivroRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
public class REQ02ConsultarLivro {
@Autowired
LivroRepository repository ;
static Livro livro;
@Test
public void CT01ConsultaLivro_com_sucesso() {
// dado que nao existem livros cadastrados
livro = new Livro("3333", "Teste de Software", "Delamaro");
repository.save(livro);
//quando o usuario consulta o livro
Livro ro = repository.findByIsbn("3333");
//entao
assertThat(ro).isEqualTo(livro);
}
}