
package pt.lojabikes.transações;


public class Preço {

    private Moeda moeda = Moeda.EURO; // predefinição
    private double valor;
    
    public Preço(double valor) {
        this.valor = valor;
    }
    
    Preço(double valor, Moeda moeda) {
		this.valor = valor;
		this.moeda = moeda;
	}

    public double getValor() {
        return valor * moeda.getTaxa();
    }

 
    
    
}
