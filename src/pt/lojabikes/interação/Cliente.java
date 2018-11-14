package pt.lojabikes.interação;

import pt.lojabikes.bens.Bike;

public class Cliente {

    //: Identidade do cliente
    private String nome;
    private String apelido;
    private int idade;
    private String gênero;
    private String endereço;
    private int contacto;
    private int nif;
    private double dívida;
    private Bike proprietário;
    
    Bike bike;
    
    
    public Cliente(String nome, String apelido, int nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
    }

    public boolean comprar(Bike bike) {
		if (bike.éVendido() == false) {
			proprietário = bike;
			dívida += bike.getPreço();
		}
		return proprietário != null;
	} 

    public String getNome() {
        return nome;
    }
    
    public String getTransação() {
		return proprietário == null ? "0 bicicletas!" : "bicicleta " + proprietário.getMarca()+ " por €" + dívida;
	}
    
}

      
    
    
    

