package one.digitalinnovation.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {
	
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.inciarConexao();
	}
	
	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	}
	
	@AfterEach
	void removeDadosParaTeste() {
		BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	}
	
	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	
	@Test
	void validarDadosDeRetorno2() {
		Assertions.assertNull(null);
	}
	
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
	}
}
