package pucrs.facin.comp_grafica.trabalho01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
	private static List<Vivente> viventes;
	
	public static void lerArquivo(String path) {
		try {
			viventes = new ArrayList<Vivente>();
			FileReader arquivo = new FileReader(path);
			BufferedReader leitor = new BufferedReader(arquivo);
			
			String linha = leitor.readLine();
			while(linha != null) {
				Vivente novoVivente = new Vivente();
				
				if(isValidLine(linha)) {
					for(String tripla : separarTriplas(linha)) {
						if(isValidTripla(tripla)) {
							int x = getInformation(tripla, 0);
							int y = getInformation(tripla, 1);
							int tempo = getInformation(tripla, 2);
							
							novoVivente.addMovimento(x, y, tempo);
						}
					}
				}
				
				viventes.add(novoVivente);
				linha = leitor.readLine();
			}
		 
			arquivo.close();
		} catch(IOException ex) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", ex.getMessage());
		}
	}
	
	public static List<Vivente> getViventes() {
		return viventes;
	}

	private static int getInformation(String tripla, int indice){
		String[] dados = separarDados(tripla);
		return Integer.parseInt(dados[indice]);
	}
	
	private static boolean isValidTripla(String dados) {
		return dados.split(",").length > 2;
	}

	private static String[] separarDados(String tripla) {
		return tripla.replace(")", "").split(",");
	}

	private static String[] separarTriplas(String linha) {
		String listaDeTriplhas = removeUselessness(linha);
		return listaDeTriplhas.split("\\(");
	}

	private static String removeUselessness(String linha) {
		String[] separa = linha.split("\t");
		String listaDeTriplas = separa[1];
		return listaDeTriplas;
	}

	private static boolean isValidLine(String linha) {
		return !linha.contains("[");
	}
}
