package pt.lojabikes;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import pt.lojabikes.bens.Bike;
import pt.lojabikes.interação.Fornecedores;
import pt.lojabikes.interação.Cliente;
import pt.lojabikes.transações.Moeda;
import pt.lojabikes.bens.Pneus;

/**
 * Teste class Loja das Bikes  
 * @author Admin
 * 
 */
public class LojaBikes {

    ArrayList<Bike> bicicletas = new ArrayList<>(); 
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Fornecedores> fornecedores = new ArrayList<>(); 
       
    LojaBikes loja;
    
    private String endereço;
    private int códigoPostal;
    private int contacto;
    private String email;

    LojaBikes(String endereço, int códigoPostal, int contacto, String email) {
        this.endereço = endereço;
        this.códigoPostal = códigoPostal;
        this.contacto = contacto;
        this.email = email;
    }

    public LojaBikes() {
    }

    void gerirBikes() {
        
        bicicletas.add(new Bike("Orbita", "Montanha", "Preto",1000));
        bicicletas.add(new Bike("Iberica", "Pasteleira", "Verde",650));
        bicicletas.add(new Bike("Vilar", "Pasteleira", "Azul",350));
        bicicletas.add(new Bike("Btwin", "Montanha", "Vermelho",180));
        bicicletas.add(new Bike("Orbita", "Pasteleira", "Verde",250));
        bicicletas.add(new Bike("Vilar", "Montanha", "Roxo",400));
        
        
        }

    void gerirClientes() {
        
        clientes.add(new Cliente("John", "Silva", 220999888));
        clientes.add(new Cliente("David", "Teles", 222333444));
        clientes.add(new Cliente("Luis", "Sousa", 222555666));
        clientes.add(new Cliente("Tiago", "Monteiro", 222777444));
        clientes.add(new Cliente("Marco", "Neves", 222999222));
        clientes.add(new Cliente("Andre", "Caeiro", 222555222));
        
        
     
    }
    
    void gerirFornecedores(){
        fornecedores.add(new Fornecedores("Orbita","Águeda",213334455,50599988,"Orbita@gmail.com"));
        fornecedores.add(new Fornecedores("Iberica","Aveiro",217774422,50399988,"Iberica@gmail.com"));
        fornecedores.add(new Fornecedores("Vilar","Aveiro",219998877,50499988,"Vilar@gmail.com"));
    }

    void gerirLoja() {
        loja = new LojaBikes("Queluz", 2745, 960000000, "bica@gmail.com");
    }

    
    Bike getBike(int id){
        return bicicletas.get(id);
    }
    
    Cliente getCliente(int id){
        return clientes.get(id);
    }
    
    Fornecedores getFornecedores(int id){
        return fornecedores.get(id);
    }
    
    
    void vender(Bike bike, Cliente cliente) {
       		if (cliente.comprar(bike)) bike.setVendido();
	    }
    
    
    
    
    // Indica a contagem ex: Orbitas total do arraylist 
    int getBike(String marca){
        //String Bike = null;
        int count = 0;
        
        for(Bike value : bicicletas){
            if(value.getMarca().equalsIgnoreCase(marca))
                count++;
        }
        return count;
      }
          
    // Compara objectos dentro da arraylist
   public ArrayList<Bike> procurarMarca(String marca){
      
    ArrayList<Bike> resultados = new ArrayList<>();
    
    for (Bike bike : bicicletas) {
                    
        if(marca.equals(bike.getMarca()))
            resultados.add(bike);
}   
   //Se o resultado for 0 do Method anterior corre a seguinte instrução de Exception 
    if (resultados.isEmpty())
        throw new RuntimeException("Não temos Bicicletas da Marca " + marca);
    
    return resultados;
   
  }
   
   /**
    * 
    * Método de procura que aceita várias formas de procura
    *  Evita a necessidade de fornecer um method "Overloaded" para cada filtro de pesquisa
    */
   
   public List<Bike> procurarBicicletas(Predicate<Bike>filtro){
   return bicicletas.stream().filter(filtro).collect(Collectors.toList());
   }
  
   
   /*
  public ArrayList<Bike> procurarBicicletas(Predicate<Bike>filtro){
  ArrayList<Bike> resultados = new ArrayList<>();
    for (Bike bike: bicicletas){
        if (filtro.test(bike))
            resultados.add(bike);
     
    }
    return resultados;
  } 
   
  */
   
   
   
}

   
    

