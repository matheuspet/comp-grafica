package pucrs.facin.comp_grafica.trabalho01;

import java.awt.Point;
import java.util.Map.Entry;

public class Analisador {
	private static boolean[][][] matriz = new boolean[245][1020][1020];
	
	public static void fluxoEm(Iterable<Vivente> amostra, Point referencia) {
		
	}
	
	public static void grupos() {
		
	}
	
	public static void split() {
		
	}
	
	public static void toMatrix(Iterable<Vivente> amostra) {		
		for(Vivente vivente : amostra) {
			for(Entry<Integer,Point> tupla : vivente.getMovimentos().entrySet()) {
				if(tupla.getKey() < 245)
					matriz[tupla.getKey()][tupla.getValue().x][tupla.getValue().y] = true;
			}
        }
    }
}
