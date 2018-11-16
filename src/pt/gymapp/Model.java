package pt.gymapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import pt.gymapp.aulas.Horário;
import pt.gymapp.aulas.Dificuldade;
import pt.gymapp.aulas.Aula;
import pt.gymapp.professores.Professor;
import pt.gymapp.utilizadores.Utilizador;

public class Model {

    ArrayList<Aula> aulas = new ArrayList<>();
    ArrayList<Utilizador> utilizadores = new ArrayList<>();
    ArrayList<Professor> professores = new ArrayList<>();

    /*Aula getAula(int id) {
        return (Aula) aulas.get(id);
    }*/
    
    Utilizador getUtilizador(int id) {
        return (Utilizador) utilizadores.get(id);
    }
    
        /*Aula procurarAula(int número) {
        return aulas.get(número);
    }*/

    public List<Aula> procurarAulas(Predicate<Aula> filtro) {
        return aulas.stream().filter(filtro).collect(Collectors.toList());
    }
    
    public void gerirAulas() {

        aulas.add(new Aula("yoga", Dificuldade.Média, Horário.Manhã));
        aulas.add(new Aula("cardio", Dificuldade.Elevada, Horário.Noite));
        aulas.add(new Aula("hiit", Dificuldade.Elevada, Horário.Tarde));
        aulas.add(new Aula("spinning", Dificuldade.Média, Horário.Manhã));
        aulas.add(new Aula("musculação", Dificuldade.Elevada, Horário.Manhã));
        aulas.add(new Aula("bodyCombat", Dificuldade.Elevada, Horário.Noite));

    }

    public void gerirUtilizadores() {

        utilizadores.add(new Utilizador("Alexandre Franco", 150, 134,"afranco@gmail.com", 923875409));
        utilizadores.add(new Utilizador("Rui Nunes", -20, 47, "ruinunes34@gmail.com", 934678402));
        utilizadores.add(new Utilizador("João Fonseca", 120, 49, "jfr@gmail.com", 926833001));
        utilizadores.add(new Utilizador("Mário Reis", 130, 221, "mareis@gmail.com", 916834091));
        utilizadores.add(new Utilizador("Sónia Freitas", 170, 135,"sfreitas@gmail.com", 928875434));
        utilizadores.add(new Utilizador("Rui Pires", -45, 22, "ruipirmt5@gmail.com", 917903467));
        utilizadores.add(new Utilizador("Joana Pinto", 100, 48, "japinto@gmail.com", 934787903));
        utilizadores.add(new Utilizador("Vanda Sousa", 95, 217, "vandasousa123@gmail.com", 916678341));

    }
    
    public void gerirProfessores() {

        professores.add(new Professor("Joana Carvalho","JoanaC@gmail.com", 910658775));
        professores.add(new Professor("Vanessa Lima","vanlima@gmail.com", 919975432));
        professores.add(new Professor("Maria Reis","MariafCreis@gmail.com", 937690253));
        professores.add(new Professor("Marina Schwartz","mschwartz@gmail.com", 928654432));

    }


    }

   

