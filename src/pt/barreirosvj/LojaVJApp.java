package pt.barreirosvj;

/*import pt.barreirosvj.gui.GUIlherme;*/
import java.util.ArrayList;
import java.util.List;
import pt.barreirosvj.mercadoria.StockJogos;
import pt.barreirosvj.mercadoria.Videojogo;

/**
 * Aplicação para gerir uma loja de videojogos.
 *
 */
public class LojaVJApp {

    private static LojaVJ loja = new LojaVJ();
    /*private static GUIlherme gUI = new GUIlherme();*/
    private static StockJogos stock = new StockJogos(20);

    public static void main(String[] args) {
        loja.gerirJogos();
        List <Videojogo> resultados2 = loja.procurarJogos2(
            videojogo -> "PS4".equals(videojogo.getCaracterísticas().getPlataforma()) & 20.0 <= videojogo.getPreço().getValor()
        );
        System.out.println(resultados2);
        System.out.println("Fim");
        
        /*ArrayList<Videojogo> resultados = loja.procurarJogos("PS4");
        System.out.println(resultados);
        System.out.println("This is working? Please be working.");
        Videojogo procurarJogo = loja.procurarJogos(40);
        System.out.println(resultados);
        System.out.println("This is also working... I think");*/
    }

}
