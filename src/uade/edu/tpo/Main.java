package uade.edu.tpo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		List<List<Integer>> nucleotidos = Arrays.asList(Arrays.asList(3,2,1,5,6), Arrays.asList(3,4,2),
				Arrays.asList(2,9,3,1), Arrays.asList(4,8,7,3));
		
		EncontrarGenomaHumano genoma = new EncontrarGenomaHumano();
		
		List<Integer> resultado = genoma.encontrarGenomaHumano(nucleotidos, 3330, 5224);
		
		imprimirVector(resultado);
		*/
		

		
		
		
		//CALCULANDO COMPLEJIDAD TEMPORAL PRACTICA
		
		/*
		//n = 4 , m = 5
		List<List<Integer>> nucleotidos5Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9), 
				Arrays.asList(1,4,3,8,1),
				Arrays.asList(2,9,6,2,3), 
				Arrays.
				asList(9,8,2,3,0));
		calcularTiempoAlgoritmo(nucleotidos5Cifras, 1500, 5650);
		*/
		
		
		/*
		//n = 4 , m = 10
		List<List<Integer>> nucleotidos10Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9,3,2,6,8,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3), 
				Arrays.asList(9,8,2,3,0,9,8,2,3,0));
		calcularTiempoAlgoritmo(nucleotidos10Cifras, 1331, 1400);
		*/
		/*
		//n=4 , m = 10
		List<List<Integer>> nucleotidos10Cifras = Arrays.asList(
				Arrays.asList(1,2,3,8,9,6,2,6,3,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3), 
				Arrays.asList(9,8,2,3,0,9,8,2,3,0));
		calcularTiempoAlgoritmo(nucleotidos10Cifras, 6400, 9300);
		*/
		
		
		List<List<Integer>> nucleotidos50Cifras = Arrays.asList(
				Arrays.asList(1,2,3,8,9,6,2,6,3,9,1,2,3,8,9,6,2,6,3,9,1,2,3,8,9,6,2,6,3,9,1,2,3,8,9,6,2,6,3,9,1,2,3,8,9,6,2,6,3,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3), 
				Arrays.asList(9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3));
		calcularTiempoAlgoritmo(nucleotidos50Cifras, 1400, 2500);
		
		
		
		
		
		
		
		
		//n = 4 , m = 50
		/*
		List<List<Integer>> nucleotidos50Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3));
		calcularTiempoAlgoritmo(nucleotidos50Cifras, 1331, 	4000);
		*/
		
		
		/*
		List<List<Integer>> nucleotidos50Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3));
		calcularTiempoAlgoritmo(nucleotidos50Cifras, 1331, 	4000);
		*/
		
		
		
		/*
		//n = 4 , m = 100
		List<List<Integer>> nucleotidos100Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3), 
				Arrays.asList(9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,4));
		calcularTiempoAlgoritmo(nucleotidos100Cifras, 1331, 2000);
		*/
		
		/*
		//n = 4 , m = 150
		List<List<Integer>> nucleotidos150Cifras = Arrays.asList(
				Arrays.asList(3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9,3,2,6,8,9),  
				Arrays.asList(1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3),
				Arrays.asList(2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,2,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,9,6,2,3,2,9,6,2,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3), 
				Arrays.asList(9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,4,9,8,2,3,0,9,8,2,3,0,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3,1,4,3,8,1,2,1,5,1,3));
		calcularTiempoAlgoritmo(nucleotidos150Cifras, 1331, 5650);
		*/
	
	}
	

	public static void calcularTiempoAlgoritmo(List<List<Integer>> nucleotidos, int rangoDesde, 
			int rangoHasta) {
		EncontrarGenomaHumano backtracking = new EncontrarGenomaHumano();
		
		long tiempoInicio = System.currentTimeMillis();
		backtracking.encontrarGenomaHumano(nucleotidos, rangoDesde, rangoHasta);
		long tiempoFin = System.currentTimeMillis();
		long tiempoTotal = tiempoFin - tiempoInicio;
		
		System.out.println("----------COSTO-TEMPORAL-PRACTICO-----------");
		System.out.println("n: " + nucleotidos.size());
		//System.out.println("m: " + obtenerLongVectorMasLargo(nucleotidos));
		System.out.println("RangoDesde: " + rangoDesde);
		System.out.println("RangoHasta: " + rangoHasta);
		System.out.println("Tiempo: " + tiempoTotal + "ms");
		System.out.println("--------------------------------------------");
	}
	
	
	public static int obtenerLongVectorMasLargo(List<List<Integer>> vectores) {
		int cantDigitosMayor = 0;
		for(int i = 0; i < vectores.size(); i++) {
			int cantDigitos = vectores.get(i).size();
			if(cantDigitos > cantDigitosMayor) {
				cantDigitosMayor = cantDigitos;
			}
		}
		return cantDigitosMayor;
	}
	
	
	public static void imprimirVector(List<Integer> vector) {
		int i;
		for(i = 0; i < vector.size() - 1; i++) {
			System.out.print(vector.get(i) + "-");
		}
		System.out.print(vector.get(i));
	}

}
