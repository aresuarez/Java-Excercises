package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prueba {

		@Test
		 public void testSuma() {
			int resultado = Calculadora.suma(2,3);
		    int esperado = 5;
		    assertEquals(esperado, resultado);
		   }
		   
		@Test
		 public void  testResta() {
			int resultado = Calculadora.resta(6,4);
		    int esperado = 2;
		    assertEquals(esperado, resultado);
		   }
		@Test
		 public void  testMultiplica() {
			int resultado = Calculadora.multiplica(4,4);
		    int esperado = 16;
		    assertEquals(esperado, resultado);
		   }
		@Test
		 public void  testDivide() {
			int resultado = Calculadora.divide(10,2);
		    int esperado = 5;   
		    assertEquals(esperado, resultado);
		   }
		
			
	}

