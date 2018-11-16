/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.biblio.coleção;

import pt.biblio.coleção.InfoTécnica;
import pt.biblio.coleção.Identificação;
import pt.biblio.coleção.Gestão;

/**
 *
 * @author Admin
 */
public class Livro {

    String getAutor() {
        return identificação.getAutor();
    }

    //Identificação
    //String título;
    //String subtítulo;
    //String autor; 
    public Identificação identificação;
    //Descrição
    //String descrição;
    // double user_rating;
    //Género
    //String género;
    //String sub_géneros; // Labels?
    //Informação Técnica
    // String editora;
    // int ano_publicação;
    //  int no_páginas;
    private Descrição descrição;
    private InfoTécnica infoTécnica;
    //Gestão
    // boolean disponível;
    //String quando_disponível;
    //int no_empréstimos;
    // boolean ebook; 
    private Gestão gestão;

    Livro(String título, String autor) {
        identificação = new Identificação(título, autor);

    }

    Livro(String título, String autor, boolean disponível) {
        this.identificação = new Identificação(título, autor);
        gestão = new Gestão(disponível);

    }

    Livro(double user_rating, Língua língua) {
        descrição = new Descrição(user_rating);
        infoTécnica.setLíngua(língua);
    }

    public Livro(String autor) {
        identificação = new Identificação(autor);
    }

    /**
     * @return the identificação
     */
    /*public Identificação getIdentificação() {
        return identificação;
    }
*/
    /**
     * @param identificação the identificação to set
     
    public void setIdentificação(Identificação identificação) {
        this.identificação = identificação;
    }

    /**
     * @return the descrição
     */
    /*public Descrição getDescrição() {
        return descrição;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setDescrição(Descrição descrição) {
        this.descrição = descrição;
    }

    /**
     * @return the infoTécnica
     
    public InfoTécnica getInfoTécnica() {
        return infoTécnica;
    }

    /**
     * @param infoTécnica the infoTécnica to set
     *
    public void setInfoTécnica(InfoTécnica infoTécnica) {
        this.infoTécnica = infoTécnica;
    }

    /**
     * @return the gestão
     *
    public Gestão getGestão() {
        return gestão;
    }

    /**
     * @param gestão the gestão to set
     *
    public void setGestão(Gestão gestão) {
        this.gestão = gestão;
    }*/

    @Override
    public String toString() {
      //  return "Livros encontrados: " + identificação.título;
      return identificação.título;
    }

}
