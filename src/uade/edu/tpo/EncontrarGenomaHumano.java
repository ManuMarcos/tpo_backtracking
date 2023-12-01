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
		
		
		//this.combNucleotidos(nucleotidos, rangoDesde, rangoHasta, 0, 0, soluciones);
		this.fuerzaBruta(nucleotidos, rangoDesde, rangoHasta, 0, 0, soluciones);

		return soluciones;
	}
	
	
	private void combNucleotidos(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta, int etapa,
			int solucionParcial, List<Integer> soluciones) {
		//System.out.println("Llamado");
		
		
		for (int i = 0; i < nucleotidos.get(etapa).size(); i++) {
			solucionParcial = solucionParcial * 10 + nucleotidos.get(etapa).get(i);
			//System.out.println("Pruebo: " + solucionParcial + "  ");
			
			if (esFactible(solucionParcial, rangoDesde, rangoHasta, nucleotidos.size() - 1, etapa)) {
				
				if(etapa == nucleotidos.size() - 1) {
					soluciones.add(solucionParcial);	
				}
				else {
					combNucleotidos(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
				}
			}
			solucionParcial = (solucionParcial - nucleotidos.get(etapa).get(i)) / 10;
		}	
	}
	
	private void fuerzaBruta(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta,
			int etapa,int solucionParcial, List<Integer> soluciones) {
	
		//System.out.println("Llamado");
		for(int i = 0; i < nucleotidos.get(etapa).size(); i++) {
			solucionParcial = solucionParcial * 10 + nucleotidos.get(etapa).get(i);
			
			if(etapa == nucleotidos.size() - 1) {
				//System.out.println("SolucionParcial: " + solucionParcial + 
				//	" RangoDesde: " + rangoDesde + " RangoHasta: " + rangoHasta);
				System.out.println("Pruebo: " + solucionParcial + "  ");

				
				if(solucionParcial >= rangoDesde && solucionParcial <= rangoHasta) {
					//System.out.println("Agrego: " + solucionParcial);
					soluciones.add(solucionParcial);
				}	
				
				
			}
			else {
				fuerzaBruta(nucleotidos, rangoDesde, rangoHasta, etapa + 1, solucionParcial, soluciones);
			}	
			solucionParcial = (solucionParcial - nucleotidos.get(etapa).get(i)) / 10;
			
		}
	}

	
	
	private boolean esFactible(int numero, int minimo, int maximo, int cifras, int etapa) {
		//long tiempoInicio = System.currentTimeMillis();
		
		int extraerDigitos = power(10, cifras - etapa);
		
		minimo = minimo / extraerDigitos;
		//System.out.print("Minimo: " + minimo + " ");
		maximo = maximo / extraerDigitos;
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
	
	
	
	public static int power(int x, int y)
    {
        int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
  
        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

	
	
	
	
		
	
	
}
