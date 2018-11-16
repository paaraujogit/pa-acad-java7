package pt.barreirosvj.informações;

/**
 * Informação mais importante sobre os jogos.
 * 
 */

public class Características {
    private String género;
        //Acção? Luta? Desportos?
    private String plataforma;
        //PC? Consola? Qual consola?
    private Classificação classificação;
        //usando a classificação PEGI
    private String conteúdo;
        //violência? Sexualidade? Etc
    
    public Características(String género, String plataforma, Classificação classificação, String conteúdo){
        this.género = género;
        this.plataforma = plataforma;
        this.classificação = classificação;
        this.conteúdo = conteúdo;
    }

    /**
     * @return the género
     */
    public String getGénero() {
        return género;
    }

    /**
     * @param género the género to set
     */
    public void setGénero(String género) {
        this.género = género;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the classificação
     */
    public Classificação getClassificação() {
        return classificação;
    }

    /**
     * @param classificação the classificação to set
     */
    public void setClassificação(Classificação classificação) {
        this.classificação = classificação;
    }

    /**
     * @return the conteúdo
     */
    public String getConteúdo() {
        return conteúdo;
    }

    /**
     * @param conteúdo the conteúdo to set
     */
    public void setConteúdo(String conteúdo) {
        this.conteúdo = conteúdo;
    }
}
