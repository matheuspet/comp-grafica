package pucrs.facin.comp_grafica.trabalho01;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class Analisador {
	private static List<List<List<Boolean>>> matriz;

	private static final String MENSAGEM_GRUPO = " Grupo de %s viventes entre momentos %s e %s";
	
	private static int qtdMinimaParaGrupo;
	private static int distanciaMinimaParaGrupo;

	public static void detectarVelocidades() {
		
	}
	
	public static void detectarGrupo(Iterable<Vivente> amostra, int grupo, int distancia, int tempoMinimoParaGrupo) {
		qtdMinimaParaGrupo = grupo;
		distanciaMinimaParaGrupo = distancia;
		
		int groupKeeping = 0;
		for(int momento = 0; momento < 350; momento++) {
			List<Point> viventes = getViventesAtMoment(momento, amostra);
			if(hasGroup(viventes)) groupKeeping++;
			else {
				if(groupKeeping >= tempoMinimoParaGrupo) {
					int momentoInicial = momento - groupKeeping; 
					int momentoFinal = momento;
					System.out.println(String.format(MENSAGEM_GRUPO, viventes.size(), momentoInicial, momentoFinal));
				}
				groupKeeping = 0;
			}
		}
	}

	private static boolean hasGroup(List<Point> viventes) {
		int quorum = 0;
		
		for(int i = 0; i < viventes.size(); i++) { 			
			for(int k = i + 1; k < viventes.size(); k++) { 
				Point vivente = viventes.get(i);
				Point outroVivente = viventes.get(k);
				int distancia = (int) vivente.distance(outroVivente);
				
				if(distancia < distanciaMinimaParaGrupo) quorum++;
				if(quorum > qtdMinimaParaGrupo) return true;
			}
		}
		return false;
	}

	private static List<Point> getViventesAtMoment(int momento, Iterable<Vivente> amostra) {
		List<Point> viventes = new ArrayList<Point>();
		
		for(Vivente vivente : amostra) {
			Point local = vivente.getMovimentos().get(momento);
			if(local != null) {
				viventes.add(local);
			}
		}
		
		return viventes;
	}

	@Deprecated
	public static void toMatrix(Iterable<Vivente> amostra) {
		initMatrix();

		for(Vivente vivente : amostra) { 
			for(Entry<Integer,Point> tupla : vivente.getMovimentos().entrySet()) {
				int instante = tupla.getKey();
				int x = tupla.getValue().x;
				int y = tupla.getValue().y;
				
			}
		}
    }

	@Deprecated
	private static void initMatrix() {
		matriz = new ArrayList<List<List<Boolean>>>();
		
		for(int col = 0; col < 1020; col++) {
			matriz.add(col, new ArrayList<List<Boolean>>());	
			for(int lin = 0; lin < 1020; lin++) {
				matriz.get(col).add(lin, new ArrayList<Boolean>());
			}
		}
	}
	
}
