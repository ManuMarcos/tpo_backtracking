package tpo_progra3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uade.edu.ar.gen.AlgoritmoGenomaHumano;

public class encontrarGenomaHumanoBacktracking  {

	
	public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, 
			int rangoHasta) {
		// TODO Auto-generated method stub
		
		List<Integer> soluciones = new ArrayList<Integer>();
		
		this.backtracking(nucleotidos, rangoDesde, rangoHasta, 0, new ArrayList<Integer>(), 
				soluciones);
		return soluciones;
	}

	
	
	private void backtracking(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta, int etapa,
			List<Integer> solucionParcial, List<Integer> soluciones) {
		
		for (int i = 0; i < nucleotidos.get(etapa).size(); i++) {
			solucionParcial.add((int) (nucleotidos.get(etapa).get(i) * Math.pow(10, nucleotidos.size() - 1 - etapa)));
			System.out.print("Pruebo : ");
			imprimirVector(solucionParcial);
			System.out.println();
			if (esFactible(solucionParcial, rangoDesde, rangoHasta)) {
				if(solucionParcial.size() == nucleotidos.size()) {
					soluciones.add(arrayToInt(solucionParcial));
				}
				else {
					backtracking(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
				}
			}
			int ultimoIndice = solucionParcial.size() - 1;
			solucionParcial.remove(ultimoIndice);
		}
		
		
		
	}
	
	
	private boolean esFactible(List<Integer> numero, int min, int maximo) {
		int suma = arrayToInt(numero);
		if (suma >= min && suma <= maximo) {
			return true;
		}
		return false;
	}
	
	private int arrayToInt(List<Integer> numero) {
		int resultado = 0;
		for(int i : numero) {
			resultado += i;
		}
		return resultado;
	}
	
	private void imprimirVector(List<Integer> vector) {
		int i ;
		for(i = 0 ; i < vector.size() - 1; i++) {
			System.out.print(vector.get(i) + "-");
		}
		System.out.print(vector.get(i));
	}
}
