package one.digitalinnovation.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

	@Test
	void deveCalcularIdadeCorretamente() {
		Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2001, 1, 1, 15, 0, 0));
		Assertions.assertEquals(22, jessica.getIdade());
	}
	
	@Test
	void deveRetornarSeEMaiorDeIdade() {
		Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2001, 1, 1, 15, 0, 0));
		Assertions.assertTrue(jessica.isMaiorDeIdade());
		
		Pessoa joao = new Pessoa("João", LocalDateTime.now());
		Assertions.assertFalse(joao.isMaiorDeIdade());
	}
}	
