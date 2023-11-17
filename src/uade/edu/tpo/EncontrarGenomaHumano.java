package uade.edu.tpo;

import java.util.ArrayList;
import java.util.List;

import uade.edu.ar.gen.AlgoritmoGenomaHumano;

public class EncontrarGenomaHumano implements AlgoritmoGenomaHumano{

	
	public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, 
			int rangoHasta) {
		// TODO Auto-generated method stub
		
		List<Integer> soluciones = new ArrayList<Integer>();
		int cantNucleotidos = nucleotidos.size();
		
		int cantDigitosHasta = cantDigitos(rangoHasta);
		
		if(cantDigitosHasta > cantNucleotidos || cantDigitosHasta < cantNucleotidos) {
			return soluciones;
		}
		
		this.backtracking(nucleotidos, rangoDesde, rangoHasta, 0, 0, soluciones);
		
		return soluciones;
	}
	
	
	private void backtracking(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta, int etapa,
			int solucionParcial, List<Integer> soluciones) {
		
		for (int i = 0; i < nucleotidos.get(etapa).size(); i++) {
			solucionParcial = solucionParcial * 10 + nucleotidos.get(etapa).get(i);
			//System.out.print("Pruebo: " + solucionParcial + "  ");
			if (esFactible(solucionParcial, rangoDesde, rangoHasta, nucleotidos.size() - 1, etapa)) {
				if(etapa == nucleotidos.size() - 1) {
					//soluciones.add(solucionParcial);
				}
				else {
					backtracking(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
				}
			}
			solucionParcial = (solucionParcial - nucleotidos.get(etapa).get(i)) / 10;
		}
	}

	private boolean esFactible(int numero, int minimo, int maximo, int cifras, int etapa) {
		minimo = (int) (minimo / Math.pow(10, cifras - etapa));
		//System.out.print("Minimo: " + minimo + " ");
		maximo = (int) (maximo / Math.pow(10, cifras - etapa));
		//System.out.print("Maximo: " + maximo + " ");
		if (numero >= minimo && numero <= maximo) {
			//System.out.println("-> Es Factible");
			return true;
		}
		//System.out.println("-> No es Factible");
		return false;
	}

	private int cantDigitos(int numero) {
		int cantDigitos = (int) (Math.log10(numero) + 1);
		//System.out.println("Numero: " + numero + " ,Cant digitos: " + cantDigitos);
		return cantDigitos;
	}
	
	
}
