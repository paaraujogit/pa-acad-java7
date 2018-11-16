package pt.biblio.coleção;

public class Identificação {

    String título;
    private String subtítulo;
    private String autor;
  

    Identificação(String título, String autor) {
        this.título = título;
        this.autor = autor;

    }

    public Identificação(String autor) {
         this.autor = autor;}

    public String getAutor() {
        return autor; }
}
