package pt.gymapp.aulas;

/**
 * <span style = "color:green;" >Hello Hello Promoções</span>
 * @author Admin
 */

public enum Dificuldade {
    
    Baixa (1,320,"Baixa"),
    Média (2,510,"Média"),
    Elevada (3,680,"Elevada");
    
    private int nível;
    private int calorias;
    private String nome;
    
    Dificuldade(int nível, int calorias, String nome) {
        this.nível = nível;
        this.calorias = calorias;
        this.nome = nome;
        }
}