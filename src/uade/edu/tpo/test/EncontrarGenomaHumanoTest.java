package uade.edu.tpo.test;

import uade.edu.tpo.EncontrarGenomaHumano;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EncontrarGenomaHumanoTest {

	private static final EncontrarGenomaHumano backtracking = new EncontrarGenomaHumano();
	
	@Test
	public void ejemplo1() {
		int rangoDesde = 40;
		int rangoHasta = 78;
		
		List<Integer> resultadoEsperado = Arrays.asList(54,55,59,52,74,75,72);
		
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(5,3,7), Arrays.asList(4,5,9,2));
		
		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		
		assertTrue(resultadoEsperado.equals(resultado));
	}
	
	@Test
	public void ejemplo2() {
		int rangoDesde = 500;
		int rangoHasta = 900;
		
		List<Integer> resultadoEsperado = Arrays.asList(655,659,652, 695, 699,692, 625,629, 622, 
				855, 859, 852, 895, 899, 892,825,829, 822);
		
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(4,6,8), Arrays.asList(5,9,2), 
				Arrays.asList(5,9,2));
		
		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		
		assertTrue(resultadoEsperado.equals(resultado));
	}
	
	@Test
	public void ejemplo3() {
		int rangoDesde = 500;
		int rangoHasta = 900;
		
		List<Integer> resultadoEsperado = Arrays.asList(655,659,652, 695, 699,692, 625,629, 622, 
				855, 859, 852, 895, 899, 892,825,829, 822);
		
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(4,6,8), Arrays.asList(5,9,2), 
				Arrays.asList(5,9,2));
		
		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);

		assertTrue(resultadoEsperado.equals(resultado));
	}
	
	@Test
	public void ejemplo4() {
		int rangoDesde = 500;
		int rangoHasta = 900;
		
		List<Integer> resultadoEsperado = Arrays.asList(655,659,652, 695, 699,692, 625,629, 622, 
				855, 859, 852, 895, 899, 892,825,829, 822);
		
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(4,6,8), Arrays.asList(5,9,2), 
				Arrays.asList(5,9,2));
		
		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);

		assertTrue(resultadoEsperado.equals(resultado));
	}
	
}
