package pucrs.facin.comp_grafica.trabalho01;

/**
 * @author Matheus Mattos e Thomás Vieira
 *
 */
public class App {
    public static void main( String[] args ) {
        Leitor.lerArquivo("src/test/resources/Paths_Facin.txt");
        Analisador.toMatrix(Leitor.getViventes());
    }
}
