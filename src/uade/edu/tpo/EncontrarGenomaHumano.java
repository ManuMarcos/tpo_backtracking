package uade.edu.tpo;

import java.util.ArrayList;
import java.util.List;

import uade.edu.ar.gen.AlgoritmoGenomaHumano;

public class EncontrarGenomaHumano implements AlgoritmoGenomaHumano{

	
	public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, 
			int rangoHasta) {
		// TODO Auto-generated method stub
		
		List<Integer> soluciones = new ArrayList<Integer>();
		
		this.backtracking(nucleotidos, rangoDesde, rangoHasta, 0, 0, 
				soluciones);
		
		return soluciones;
	}
	
	private void backtracking(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta, int etapa,
			int solucionParcial, List<Integer> soluciones) {
		
		for (int i = 0; i < nucleotidos.get(etapa).size(); i++) {
			solucionParcial = solucionParcial * 10 + nucleotidos.get(etapa).get(i);
			System.out.print("Pruebo : ");
			System.out.print(solucionParcial);
			System.out.println();
			if (esFactible(solucionParcial, rangoDesde, rangoHasta, nucleotidos.size() - 1, etapa)) {
				if(etapa == nucleotidos.size() - 1) {
					soluciones.add(solucionParcial);
				}
				else {
					backtracking(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
				}
			}
			solucionParcial = (solucionParcial - nucleotidos.get(etapa).get(i)) / 10;
		}
	}

	private boolean esFactible(int numero, int minimo, int maximo, int cifras, int etapa) {
		int minimo_aux;
		int maximo_aux;
		minimo_aux = (int) (minimo / Math.pow(10, cifras - etapa));
		System.out.println("Minimo: " + minimo_aux);
		maximo_aux = (int) (maximo / Math.pow(10, cifras - etapa));
		System.out.println("Maximo: " + maximo_aux);
		if (numero >= minimo_aux && numero <= maximo_aux) {
			return true;
		}
		return false;
	}

}
