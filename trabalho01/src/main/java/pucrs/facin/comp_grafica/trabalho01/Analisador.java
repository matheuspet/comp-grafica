package pucrs.facin.comp_grafica.trabalho01;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import javax.imageio.ImageIO;

public class Analisador {
	private static final String MENSAGEM_GRUPO = " Grupo de %s viventes entre momentos %s e %s";
	private static String description;
	
	private static int qtdMinimaParaGrupo;
	private static int distanciaMinimaParaGrupo;

	private static int[][] matriz;
	private static Random r = new Random();	

    private static BufferedImage bufferedImage;
    
	public static void detectarVelocidades() {
		// TODO Analisar velocidade dos viventes
	}

	public static void desenharTrajetorias() {
		try {	        
		    File outputfile = new File("imagens/" + description + "-result.png");
		    ImageIO.write(bufferedImage, "png", outputfile);
		} catch (IOException ex) {
		    System.out.println(ex);
		}
	}
	
	public static BufferedImage pintar(int[][] umaMatriz) {
		int largura = umaMatriz.length;
		int altura = umaMatriz[0].length;
		
		BufferedImage image = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

		for (int h = 0; h < largura; h++) {
			for (int w = 0; w < altura; w++) {
				if(umaMatriz[h][w] == 0) umaMatriz[h][w] = 0XEEEEEE;
				image.setRGB(h, w, umaMatriz[h][w]);
			}
		}

		return image;
	} 
	
	public static void detectarGrupo(Iterable<Vivente> amostra, int grupo, int distancia, int tempoMinimoParaGrupo) {
		qtdMinimaParaGrupo = grupo;
		distanciaMinimaParaGrupo = distancia;
		
		int groupKeeping = 0;
		for(int momento = 0; momento <= 350; momento++) {
			List<Point> viventes = getViventesAtMoment(momento, amostra);
			if(hasGroup(viventes) && momento != 350) groupKeeping++;
			else {
				if(groupKeeping >= tempoMinimoParaGrupo) {
					int momentoInicial = momento - groupKeeping; 
					int momentoFinal = momento;

				    Graphics2D graph = bufferedImage.createGraphics();
			        graph.setColor(Color.RED);
				    int[] xPoints = new int[membrosDoGrupo.size()];
				    int[] yPoints = new int[membrosDoGrupo.size()];
				    int c = 0;
				    for(Point umCara : membrosDoGrupo) {//System.out.println(umCara);
				    	xPoints[c] = (int) umCara.getX();
						yPoints[c] = (int) umCara.getY();
						c++;
				    }
			        graph.drawPolygon(xPoints, yPoints, membrosDoGrupo.size());
			        graph.dispose();
					
					System.out.println(String.format(MENSAGEM_GRUPO, membrosDoGrupo.size(), momentoInicial, momentoFinal));
				}
				groupKeeping = 0;
			}
		}
	}

	private static List<Point> membrosDoGrupo = new ArrayList<Point>();
	private static boolean hasGroup(List<Point> viventes) {
		int quorum = 0;
		boolean awnser = false;
		List<Point> membros = new ArrayList<Point>();
		
		for(int i = 0; i < viventes.size(); i++) { 			
			for(int k = i + 1; k < viventes.size(); k++) { 
				Point vivente = viventes.get(i);
				Point outroVivente = viventes.get(k);
				int distancia = (int) vivente.distance(outroVivente); 
				if(distancia < distanciaMinimaParaGrupo) {
					quorum++;
					membros.add(vivente);
					if(quorum >= qtdMinimaParaGrupo) { 
						awnser = true;
					}
				}
			}
		}
		
		if(awnser) { membrosDoGrupo = membros; }
		return awnser;
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

	public static void init(String desc, Iterable<Vivente> amostra) {
		description = desc;
		
		int maiorX = Integer.MIN_VALUE;
		int maiorY = Integer.MIN_VALUE;

		for(Vivente vivente : amostra) { 
			for(Entry<Integer,Point> tupla : vivente.getMovimentos().entrySet()) {
				if(tupla.getValue().x > maiorX) maiorX = tupla.getValue().x;
				if(tupla.getValue().y > maiorY) maiorY = tupla.getValue().y;
			}
		}

		matriz = new int[maiorX + 1][maiorY + 1];
		
		for(Vivente vivente : amostra) { 
			int colorCode = r.nextInt(0xCCCCCC);
			for(Entry<Integer,Point> tupla : vivente.getMovimentos().entrySet()) {
				int x = (int) tupla.getValue().getX();
				int y = (int) tupla.getValue().getY();
				matriz[x][y] = colorCode;
			}
		}
		
		bufferedImage = pintar(matriz);
    }

}
