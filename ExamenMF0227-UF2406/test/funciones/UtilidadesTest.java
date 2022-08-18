package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class UtilidadesTest {

	private static Utilidades u;
	
	@BeforeAll
	static void inicializarUtilidades() {
		u =new Utilidades();
	}
	
	@Test
	void devuelveNotaTest() {
		assertAll(
				()->assertThrows(ArithmeticException.class,()-> u.devuelveNota(-1),"Debe ser igual o superior a 0"),
				()->assertThrows(ArithmeticException.class,()-> u.devuelveNota(11),"Debe ser igual o inferior a 10")
		);
		assertEquals("Suspenso",u.devuelveNota(4),"Debe devolver Suspenso");
		assertEquals("Bien",u.devuelveNota(6),"Debe devolver Bien");
		assertEquals("Notable",u.devuelveNota(8),"Debe devolver Notable");
		assertEquals("Sobresaliente",u.devuelveNota(9.5),"Debe devolver Sobresaliente");
		assertEquals("Matrícula",u.devuelveNota(10),"Debe devolver Matrícula");
	}

}
