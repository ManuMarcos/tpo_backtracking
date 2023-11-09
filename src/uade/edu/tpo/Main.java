package uade.edu.tpo;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int rangoDesde = 40;
		int rangoHasta = 78;
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(5,3,7), Arrays.asList(4,5,9,2));
		*/
		
		int rangoDesde = 3330;
		int rangoHasta = 5224;
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(3,2,1,5,6), Arrays.asList(3,4,2),
				Arrays.asList(2,9,3,2), Arrays.asList(4,8,7,3));
		
		
		EncontrarGenomaHumano backtracking = new EncontrarGenomaHumano();
		
		List<Integer> resultados = backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		System.out.println();
		System.out.println("Cantidad de resultados: " + resultados.size());
		
		imprimirVector(resultados);

	}
	
	
	public static void imprimirVector(List<Integer> vector) {
		int i;
		for(i = 0; i < vector.size() - 1; i++) {
			System.out.print(vector.get(i) + "-");
		}
		System.out.print(vector.get(i));
	}

}
