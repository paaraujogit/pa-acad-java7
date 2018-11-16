package pt.barreirosvj.informações;

/**
 * Lista de classificações em PEGI.
 * 
 */

public enum Classificação {
       
    trêsOuMais (3, '+'),
    seteOuMais (7, '+'),
    dozeOuMais (12, '+'),
    dezasseisOuMais (16, '+'),
    dezoitoOuMais (18, '+');
      
    private int idade;
    final char mais;

    private Classificação (int idade, char mais){
        this.idade = idade;
        this.mais = mais;
    }
}