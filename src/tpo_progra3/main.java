package tpo_progra3;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rangoDesde = 500;
		int rangoHasta = 900;
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(4,6,8), Arrays.asList(5,9,2),
				Arrays.asList(5,9,2));
		
		encontrarGenomaHumanoBacktracking backtracking = new encontrarGenomaHumanoBacktracking();
		
		List<Integer> resultados = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		System.out.println();
		System.out.println("Cantidad de resultados: " + resultados.size());
		
		for(int i : resultados) {
			System.out.print(i + " - ");
		}
				
		
	}
	
	
	public static void imprimirVector(int[] vector) {
		for(int i : vector) {
			System.out.print(i + "-");
		}
	}

}
