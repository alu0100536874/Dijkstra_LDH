package tests;

import static org.junit.Assert.*;
import operaciones.ListaNodo;

import org.junit.Test;


public class TestListas {
	
	@Test
	public void testListaVacia() {
		ListaNodo Lista = new ListaNodo();
		boolean resultado = Lista.isEmpty();
		assertTrue(resultado == true);
	}

}
