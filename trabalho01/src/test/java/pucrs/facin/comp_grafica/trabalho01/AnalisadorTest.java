package pucrs.facin.comp_grafica.trabalho01;

import org.junit.After;
import org.junit.Test;

/**
 * TODO 
 * Definir grupos em diistancia intima e social. Apresentar o estudo malandro, mostrar as conclusões e fechou.
 */
public class AnalisadorTest {
	
	private static int qtdMinimaParaGrupo;
	private static int distanciaMinimaParaGrupo;
	private static int tempoMinimoParaGrupo;
	
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
