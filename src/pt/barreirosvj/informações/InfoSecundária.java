package pt.barreirosvj.informações;

/**
 * Informação secundária sobre os jogos. Coisas menos importantes, pronto.
 * 
 */

public class InfoSecundária {
    private int númeroJogadoresMax;
    private double médiaAnálises;
    private boolean online;
        //tem multiplayer online ou não?
    private String sysReqs;
        //Requerimentos de sistema, exclusivo para jogos PC
    
    InfoSecundária (int númeroJogadoresMax, double médiaAnálises, boolean online, String sysReqs) {
        this.númeroJogadoresMax = númeroJogadoresMax;
        this.médiaAnálises = médiaAnálises;
        this.online = online;
        this.sysReqs = sysReqs;
    }
}
