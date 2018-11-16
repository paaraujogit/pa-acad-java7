package pt.gymapp.aulas;


public class Aula {

    private String nome;
    private Características características;
    private Horário horário;
    private Preço preço;
    private Actualização actualização;
    private SalaDeAula salaDeAula;

    public Aula(String nome, Dificuldade dificuldade, Horário horário) {
        características = new Características(dificuldade);
        this.horário = horário;
        this.nome = nome;
        /*this.preço = preço;*/
    }    

    @Override
    public String toString() {
        return "Aula{" + "nome=" + nome + ", pre\u00e7o=" + preço + '}';
    }

    public Características getCaracterísticas() {
        return características;
    }
    
    

}
