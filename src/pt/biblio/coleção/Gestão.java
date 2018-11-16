
package pt.biblio.coleção;


public class Gestão {
  private boolean disponível;
  private String quando_disponível;//melhor formato??
  private int no_empréstimos;
  private boolean ebook; 
  private boolean eliminado;
  private String idcode;

  

    Gestão(boolean disponível) {
         this.disponível = disponível;
    }

  

    /**
     * @return the disponível
     */
    public boolean isDisponível() {
        return disponível;
    }

    /**
     * @param disponível the disponível to set
     */
    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

   
  
  
  


  
    
    
}
