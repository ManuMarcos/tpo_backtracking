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

		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(5, 3, 7), Arrays.asList(4, 5, 9, 2));

		List<Integer> resultadoEsperado = Arrays.asList(54, 55, 59, 52, 74, 75, 72);

		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);

		assertTrue(resultadoEsperado.equals(resultado));
	}

	@Test
	public void ejemplo2() {
		int rangoDesde = 500;
		int rangoHasta = 900;

		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(4, 6, 8), Arrays.asList(5, 9, 2),
				Arrays.asList(5, 9, 2));

		List<Integer> resultadoEsperado = Arrays.asList(655, 659, 652, 695, 699, 692, 625, 629, 622, 855, 859, 852, 895,
				899, 892, 825, 829, 822);

		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);

		assertTrue(resultadoEsperado.equals(resultado));
	}

	@Test
	public void ejemplo3() {
		int rangoDesde = 3330;
		int rangoHasta = 5224;
		
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(3,2,1,5,6), Arrays.asList(3,4,2),
				Arrays.asList(2,9,3,1), Arrays.asList(4,8,7,3));
		
		List<Integer> resultadoEsperado = Arrays.asList(3394,3398,3397,3393,3334,3338,3337,3333,3424,3428,3427,3423
				,3494,3498,3497,3493,3434,3438,3437,3433,3414,3418,3417,3413,5224,5223,5214,5218,5217,5213);
		
		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		
		assertTrue(resultadoEsperado.equals(resultado));
	}

	@Test
	public void ejemplo4() {
		int rangoDesde = 532;
		int rangoHasta = 950;

		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(3, 5, 6, 2, 9), Arrays.asList(1, 4, 7),
				Arrays.asList(3, 6));
		
		List<Integer> resultadoEsperado = Arrays.asList(543,546,573,576,613,616,643,646,673,676,913,916,943,946);

		List<Integer> resultado = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);

		assertTrue(resultadoEsperado.equals(resultado));
	}

}
