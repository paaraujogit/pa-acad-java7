package pt.lojabikes.bens;

/**
 * Super Class
 *
 * @author Admin
 */
public abstract class Veiculo {
    //campos
    //: Informação do equipamento(bikes;skates;...)
    protected String marca;
    protected String modelo;
    protected String género;
    protected String tamanho;
    protected String cor;
    protected boolean nacional; //: True or False
    protected int garântia;
    protected int stock;
    protected int preço;

    
    
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getPreço() {
        return preço;
    }
            
    public String getMarca() {
        return marca;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
