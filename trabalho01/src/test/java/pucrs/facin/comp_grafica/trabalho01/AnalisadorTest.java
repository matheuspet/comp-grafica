package pucrs.facin.comp_grafica.trabalho01;

import org.junit.Test;

public class AnalisadorTest {
	
	private static int qtdMinimaParaGrupo;
	private static int distanciaMinimaParaGrupo;
	private static int tempoMinimoParaGrupo;
	
	@Test
    public void testFacin() {
		System.out.println("Facin: ");
		
		qtdMinimaParaGrupo = 3;
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
		
		qtdMinimaParaGrupo = 10;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 90;
		
		Leitor.lerArquivo("src/test/resources/Paths_Japan.txt");

        Analisador.init("japan", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
		
    }

	@Test
    public void testFrance() {
		System.out.println("France: ");
		
		qtdMinimaParaGrupo = 1;
		distanciaMinimaParaGrupo = 30;
		tempoMinimoParaGrupo = 1;
		
		Leitor.lerArquivo("src/test/resources/Paths_France.txt");
		
        Analisador.init("france", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	
	@Test
    public void testPortugal() {
		System.out.println("Portugal: ");
		
		qtdMinimaParaGrupo = 3;
		distanciaMinimaParaGrupo = 100;
		tempoMinimoParaGrupo = 3;
		
		Leitor.lerArquivo("src/test/resources/Paths_Portugal.txt");
        
		Analisador.init("portugal", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testArabes() {
		System.out.println("Arabes: ");
		
		qtdMinimaParaGrupo = 3;
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
		
		qtdMinimaParaGrupo = 3;
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
		
		qtdMinimaParaGrupo = 3;
		distanciaMinimaParaGrupo = 140;
		tempoMinimoParaGrupo = 5;
		
		Leitor.lerArquivo("src/test/resources/Paths_England.txt");
        
		Analisador.init("uk", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }

	@Test
    public void testTurkey() {
		System.out.println("Turkey: ");
		
		qtdMinimaParaGrupo = 3;
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
		
		qtdMinimaParaGrupo = 3;
		distanciaMinimaParaGrupo = 1000;
		tempoMinimoParaGrupo = 2;
		
		Leitor.lerArquivo("src/test/resources/Paths_Germany.txt");
        
		Analisador.init("germany", Leitor.getViventes());
        Analisador.detectarGrupo(Leitor.getViventes(), qtdMinimaParaGrupo, distanciaMinimaParaGrupo, tempoMinimoParaGrupo);
		Analisador.desenharTrajetorias();
    }
	
}
