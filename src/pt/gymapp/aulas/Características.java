package pt.gymapp.aulas;

import pt.gymapp.professores.Professor;
import pt.gymapp.aulas.Dificuldade;

public class Características {

    Professor professor;
    private int Duração;
    private Dificuldade dificuldade;
    private int CapacidadeTotal;

    public Características(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }
    
    
    
}
