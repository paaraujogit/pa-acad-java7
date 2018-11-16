package pt.barreirosvj.informações;

/**
 * O preço dos jogos
 * 
 */

public class Preço {

    private double valor;
    private double valorRecomendado;
    //preço recomendado pela editora

    public Preço(double valor, double valorRecomendado) {
        this.valor = valor;
        this.valorRecomendado = valorRecomendado;
    }
    
    public double getValor(){
        return valor;
    }
    
    
}
