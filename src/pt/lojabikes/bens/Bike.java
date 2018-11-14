package pt.lojabikes.bens;

import pt.lojabikes.transações.Moeda;

public class Bike extends Veiculo {
    //campos
    
    private boolean vendido;
    private Pneus pneus;
    private Moeda moeda;
    private Quadro quadro;
    private Bike bike;
    
    // construtores
   public Bike(String marca, String modelo, String cor, int preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preço = preço;
        
    }
/*
    public Bike() {
        this.bike = bike;
    }
*/

    
    
    //getters
    
    public boolean éVendido(){
        return vendido;    
    }

    public Bike getBike() {
        return bike;
    }
    
    
    
    
    
     // setters      
    public void setPneus(Pneus pneus) {
        this.pneus = pneus;
    }

    
    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

   
    
    public void setVendido() {
       this.vendido = true;
    }
    
    
    
    
    
    
    
    // transforma Objectos em Strings
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        
        string.append(super.getMarca());
        string.append(" ");
        string.append(super.getModelo());
        string.append(" ");
        string.append(super.getCor());
        string.append(" ");
        string.append("€" + super.getPreço());
        
        
        
        //String toString = super.getMarca() + " " + super.getModelo();
        //String toString = "É uma bike";
        return string.toString();
    }

}
