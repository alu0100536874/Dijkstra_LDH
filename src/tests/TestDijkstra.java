package tests;

import static org.junit.Assert.assertTrue;
import objetos.Grafo;
import operaciones.Disjktra;

import org.junit.Test;

public class TestDijkstra {
	
	int pesoC;
	Grafo grafo = new Grafo();
	Disjktra dijkstra = new Disjktra(grafo);
	boolean condition;
	
	@Test
	public void testPeso() {
			
		
		for(int i = 0; i<= dijkstra.getAux().size(); i++)
		{
				pesoC = dijkstra.getAux().get(i).getPeso();
				if ( pesoC != 0)
					condition = true;
		}
			assertTrue(condition == true);
	}

}
