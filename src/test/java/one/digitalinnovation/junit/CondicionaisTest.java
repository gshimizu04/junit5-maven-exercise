package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {
	
	@Test
	@EnabledIfEnvironmentVariable(named = "USER", matches = "guics")
	void validarAlgoSomenteNoUsuarioGuics() {
		Assertions.assertEquals(10, 5+5);
	}
}
