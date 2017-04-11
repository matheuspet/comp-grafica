package pucrs.facin.comp_grafica.trabalho01;

import org.junit.Test;

/**
 * TODO 
 * Definir grupos em distancia intima e social. Apresentar o estudo malandro, mostrar as conclusões e fechou.
 */
public class AnalisadorTest {
	
	private static int qtdMinimaParaGrupo;
	private static int distanciaMinimaParaGrupo;
	private static int tempoMinimoParaGrupo;
	
	@Test
    public void testFacin() {
		System.out.println("Facin: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 70;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_Facin.txt");

        Analisador.init("facin", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testJapan() {
		System.out.println("Japão: ");
		
		qtdMinimaParaGrupo = 3;
		distanciaMinimaParaGrupo = 60;
		tempoMinimoParaGrupo = 90;
		
		Leitor.lerArquivo("src/test/resources/Paths_Japan.txt");

        Analisador.init("japan", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
		
    }

	@Test
    public void testFrance() {
		System.out.println("France: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 20000;
		tempoMinimoParaGrupo = 1;
		
		Leitor.lerArquivo("src/test/resources/Paths_France.txt");
		
        Analisador.init("franca", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	
	@Test
    public void testPortugal() {
		System.out.println("Portugal: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 180;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_Portugal.txt");
        
		Analisador.init("portugal", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testArabes() {
		System.out.println("Arabes: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_Arab.txt");
        
		Analisador.init("arab", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	@Test
    public void testChina() {
		System.out.println("China: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_China.txt");
        
		Analisador.init("china", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	
	@Test
    public void testEngland() {
		System.out.println("England: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_England.txt");
        
		Analisador.init("uk", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testTurkey() {
		System.out.println("Turkey: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_Turkey.txt");
        
		Analisador.init("turkey", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testGermany() {
		System.out.println("Germany: ");
		
		qtdMinimaParaGrupo = 2;
		distanciaMinimaParaGrupo = 800;
		tempoMinimoParaGrupo = 4;
		
		Leitor.lerArquivo("src/test/resources/Paths_Germany.txt");
        
		Analisador.init("germany", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	
}
