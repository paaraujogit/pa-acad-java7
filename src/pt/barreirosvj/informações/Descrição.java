package pt.barreirosvj.informações;

/**
 * Informação imediata sobre o jogo, incluindo outras informações 
 * 
 */

public class Descrição {

    private String nome;
    private String idiomas;
    private Características características;
    private int garantiaDias;

    /*Descrição(String nome, String idiomas, Preço preço, Classificação classificação, int garantiaDias) {
        this.nome = nome;
        this.idiomas = idiomas;
        //this.preço = preço;
        this.classificação = classificação;
        this.garantiaDias = garantiaDias;
    }*/
    Descrição(String nome, String idiomas, int garantiaDias, Características características){
        this.nome = nome;
        this.idiomas = idiomas;
        this.garantiaDias = garantiaDias;
        this.características = características;
    }
    
    public Descrição (Características características){
        this.características = características;
    }
    
    public Características getCaracterísticas() {
        return características;
    }
    
    public String getName() {
        return nome;
    }
            
}
