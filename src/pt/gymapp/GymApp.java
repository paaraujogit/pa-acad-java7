package pt.gymapp;

import java.util.List;
import pt.gymapp.aulas.Aula;
import pt.gymapp.aulas.Dificuldade;
import pt.gymapp.utilizadores.Utilizador;

public class GymApp {

    public static void main(String[] args) {
      
        
        Model ginásio = new Model();
        ginásio.gerirAulas();
        ginásio.gerirUtilizadores();
        ginásio.gerirProfessores();
        GUI interfacegráfica = new GUI();
        Armazenamento armazenamento = new Armazenamento();
        
        //Testes
        /*Aula quatro = ginásio.getAula(3);
        System.out.println(quatro);

        Aula primeira = ginásio.procurarAula(0);
        System.out.println(primeira);*/
        
        Utilizador dois = ginásio.getUtilizador(1);
        System.out.println(dois);
        
        List<Aula> resultados = 
                ginásio.procurarAulas(aula -> aula.getCaracterísticas().getDificuldade().equals(Dificuldade.Média));
        System.out.println("Média");
        System.out.println(resultados);
        
    }

}
