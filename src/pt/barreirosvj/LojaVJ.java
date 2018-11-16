package pt.barreirosvj;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import pt.barreirosvj.informações.Características;
import pt.barreirosvj.informações.Classificação;
import pt.barreirosvj.informações.Descrição;
import pt.barreirosvj.informações.Preço;
import pt.barreirosvj.mercadoria.Videojogo;

/**
 * A Aplicação que gere a <span style ="color:blue;"> mercadoria </span> de
 * jogos existentes
 *
 */
public class LojaVJ {

    ArrayList<Videojogo> videojogos = new ArrayList<>();

    /*Videojogo playerOne;
    Videojogo playerTwo;
    Videojogo playerThree;
    Videojogo playerFour;
    Videojogo playerFive;
    Videojogo playerSix;
    Videojogo playerSeven;
    Videojogo playerEight;*/
    public void gerirJogos() {
        videojogos.add(new Videojogo(new Preço(59.99, 45.99), new Descrição(new Características("Festa", "Xbox One", Classificação.trêsOuMais, "n/a"))));
        videojogos.add(new Videojogo(new Preço(79.99, 69.99), new Descrição(new Características("RPG", "PC", Classificação.dezasseisOuMais, "Violência, Asneiras"))));
        videojogos.add(new Videojogo(new Preço(29.99, 19.99), new Descrição(new Características("Indie", "Nintendo Switch", Classificação.dozeOuMais, "Violência"))));
        videojogos.add(new Videojogo(new Preço(49.99, 44.99), new Descrição(new Características("Acção", "PS4", Classificação.dozeOuMais, "Asneiras"))));
        videojogos.add(new Videojogo(new Preço(49.99, 44.99), new Descrição(new Características("Desporto", "PS4", Classificação.dozeOuMais, "n/a"))));
    }

    public Videojogo getVideoJogo(int id) {
        return (Videojogo) videojogos.get(id);
    }

    public List<Videojogo> procurarJogos2(Predicate<Videojogo> filtro){
        return videojogos.stream().filter(filtro).collect(Collectors.toList());
    }
    
    public Videojogo procurarJogos(double preço) {
        Videojogo resultado = null;
        for (Videojogo videojogo : videojogos) {
            resultado = videojogo;
            if (resultado.getPreço().getValor() == 0) {
                continue;
            }
            if (resultado.getPreço().getValor() <= preço) {
                break;
            }
        }

        return resultado;

    }

    @Override
    public String toString() {
        return "LojaVJ{" + "videojogos=" + videojogos + '}';
    }
    
    

    ArrayList<Videojogo> procurarJogos(String plataforma) {
        ArrayList<Videojogo> resultados = new ArrayList<>();
        for (Videojogo videojogo : videojogos) {
            if (plataforma.equals(videojogo.getDescrição().getCaracterísticas().getPlataforma())) {
                resultados.add(videojogo);
            }
        }
        return resultados;
    }

    /*Videojogo playerOne = new Videojogo(
                new Preço(50, 45),
                new Descrição(
                        new Características("Acção", "PS4", Classificação.dozeOuMais, "Asneiras")
                )
    );*/
}
