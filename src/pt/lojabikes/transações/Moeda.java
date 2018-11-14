
package pt.lojabikes.transações;


public enum Moeda {
   
    EURO('€',"EUR",1),
    DOLLAR('$',"USD",0.8),
    LIBRA('£',"GBD",1.12); 
    
    private final char simbolo; // campos finais:cujos valores nunca mudarão
    private final String código;
    private double taxa; // como a moeda converte para euros
    
    Moeda(char simbolo,String código,double taxa){
        this.simbolo = simbolo;
        this.código = código;
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
    
    
}
