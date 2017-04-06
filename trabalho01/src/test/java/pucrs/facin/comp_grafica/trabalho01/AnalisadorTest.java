package pucrs.facin.comp_grafica.trabalho01;

import org.junit.After;
import org.junit.Test;

public class AnalisadorTest {
	
	private static int qtdMinimaParaGrupo = 2;
	private static int distanciaMinimaParaGrupo = 80;
	private static int tempoMinimoParaGrupo = 10;
	
	@After
	public void analisar() {
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
	}

	@Test
    public void testFacin() {
		System.out.println("Facin: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 80;
		tempoMinimoParaGrupo = 10;
		
		Leitor.lerArquivo("src/test/resources/Paths_Facin.txt");
    }

	@Test
    public void testJapan() {
		System.out.println("Japão: ");
		
		qtdMinimaParaGrupo = 3;
		distanciaMinimaParaGrupo = 60;
		tempoMinimoParaGrupo = 90;
		
		Leitor.lerArquivo("src/test/resources/Paths_Japan.txt");
    }

	@Test
    public void testFrance() {
		System.out.println("France: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 300;
		tempoMinimoParaGrupo = 1;
		
		Leitor.lerArquivo("src/test/resources/Paths_France.txt");
    }
	
	@Test
    public void testPortugal() {
		System.out.println("Portugal: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 180;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_Portugal.txt");
    }
	
}
