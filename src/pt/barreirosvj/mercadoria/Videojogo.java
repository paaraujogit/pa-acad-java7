package pt.barreirosvj.mercadoria;

import pt.barreirosvj.informações.Características;
import pt.barreirosvj.informações.Preço;
import pt.barreirosvj.informações.Descrição;
import pt.barreirosvj.informações.InfoSecundária;
import pt.barreirosvj.informações.InfoEdição;

/**
 * Toda a informação sobre um videojogo 
 * 
 */

public class Videojogo {
    private Preço preço;
    private Descrição descrição;
    private InfoEdição infoEdição;
    private InfoSecundária infoSecundária;  
    private Características características;
    
    /*Videojogo(Descrição descrição, InfoEdição infoEdição, InfoSecundária infoSecundária){
        this.descrição = descrição;
        this.infoEdição = infoEdição;
        this.infoSecundária = infoSecundária;
    }*/
        
    public Videojogo(Preço preço, Descrição descrição) {
        this.preço = preço;
        this.descrição = descrição;
    
    }

    public Videojogo(Preço preço, Descrição descrição, InfoEdição infoEdição) {
        this.preço = preço;
        this.descrição = descrição;
        this.infoEdição = infoEdição;
    }

    /*Videojogo(int i, char c, String fifa, String português, int i0, String ea, String ea_Sports) {
        preço = new Preço(i, c);
        descrição = new Descrição(fifa, português, i0);
        infoEdição = new InfoEdição(ea, ea_Sports);
    }*/

        /**
     * @return the preço
     */
    public Preço getPreço() {
        return preço;
    }

    /**
     * @return the descrição
     */
    public Descrição getDescrição() {
        return descrição;
    }

    /**
     * @return the infoEdição
     */
    public InfoEdição getInfoEdição() {
        return infoEdição;
    }

    /**
     * @return the infoSecundária
     */
    
    /*@Override
    public String toString(){
        return String.format("Descrição: %s%n Preço:%s%n Plataforma: %s%n", getDescrição(), getPreço(), getDescrição().getCaracterísticas().getPlataforma());
    }*/
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "(" + descrição.getName()+ ')';
        //return "bla bla bla"; 
        
    }
    
    public InfoSecundária getInfoSecundária() {
        return infoSecundária;
    }
    
    public Características getCaracterísticas() {
        return características;
    }

    
    
    
}
