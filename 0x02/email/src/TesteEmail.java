import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteEmail {

	
	@Test
	public void testar_email_com_arroba() {
	assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));

	}
	
	@Test
	public void testar_email_sem_arroba () {
	assertFalse(Pessoa.emailValid("email_teste@dominio.com.br"));


	}
	
	@Test
	public void  testar_email_mais_50_caracteres () {
	assertEquals(Pessoa.emailValid("email_teste@dominio.com.br"),false);	
	
	
		
	}
	
}

