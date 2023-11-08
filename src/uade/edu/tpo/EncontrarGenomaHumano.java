package uade.edu.tpo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uade.edu.ar.gen.AlgoritmoGenomaHumano;

public class EncontrarGenomaHumano  {

	
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
			solucionParcial += nucleotidos.get(etapa).get(i) * Math.pow(10, nucleotidos.size() - 1 - etapa);
			System.out.print("Pruebo : ");
			System.out.print(solucionParcial);
			System.out.println();
			if (esFactible(solucionParcial, rangoDesde, rangoHasta)) {
				if(etapa == nucleotidos.size() - 1) {
					soluciones.add(solucionParcial);
				}
				else {
					backtracking(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
				}
			}
			solucionParcial -= nucleotidos.get(etapa).get(i) * Math.pow(10, nucleotidos.size() - 1 - etapa);
		}
		
		
		
	}

	private boolean esFactible(int numero, int min, int maximo) {
		if (numero >= min && numero <= maximo) {
			return true;
		}
		return false;
	}

}
