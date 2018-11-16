package pt.gymapp.utilizadores;

public class Utilizador {
   
    String nome;
    private double crédito;
    private int id;
    String email;
    int telemóvel;

    public Utilizador(String nome, double crédito, int id, String email, int telemóvel) {
        this.nome = nome;
        this.crédito = crédito;
        this.id = id;
        this.email = email;
        this.telemóvel = telemóvel;
    }
    
        @Override
    public String toString() {
    return "Utilizador{" + "nome=" + nome + ", crédito=" + crédito + '}';
    }
    
}
