package pt.biblio;

import pt.biblio.persistência.Armazenamento;

import java.util.List;
import pt.biblio.user.GUI;
import pt.biblio.coleção.Biblioteca;
import pt.biblio.coleção.Livro;
import pt.biblio.user.Leitores;

/** <span style="color:blue;"> <i> Hello World! </i> </span>
 */
public class Biblio {

    private static Biblioteca biblioteca = new Biblioteca();
    private static Leitores leitores = new Leitores();
    private static GUI InterfaceGráfica = new GUI(biblioteca);
    private static Armazenamento armazenamento = new Armazenamento();

    public static void main(String[] args) {
        biblioteca.gerirlivros();
        leitores.gerirleitores();
       List<Livro> resultados = biblioteca.procurarLivros(
       livro -> "Gaiman".equals(livro.identificação.getAutor())
       );
        System.out.println("Livros encontrados: "+ resultados);
       // ArrayList<Livro> resultados = biblioteca.procurar("derp");
        
     
        
        
        
        
    }

}
