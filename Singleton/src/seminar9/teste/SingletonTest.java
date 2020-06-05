package seminar9.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import seminar9.CasaDeMarcat;

public class SingletonTest {

	@Test
	public void CasaDeMarcatInstantaUnicaTest() {
		CasaDeMarcat casa = CasaDeMarcat.getInstance();
		CasaDeMarcat casa2 = CasaDeMarcat.getInstance();
		assertSame(casa, casa2);
	}

}
