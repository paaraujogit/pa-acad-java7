package pt.lojabikes;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import pt.lojabikes.bd.Armazenamento;
import pt.lojabikes.bens.Bike;
import pt.lojabikes.bens.Skate;
import pt.lojabikes.interação.Cliente;
import pt.lojabikes.interação.GUI;
import pt.lojabikes.bens.Veiculo;

public class BikesApp {

    /**
     * Prever distribuição futura da Aplicação Java
     * @author Admin
     * 
     */
    private static LojaBikes loja;
    private static GUI interfaceGráfica = new GUI(loja);
    private static Armazenamento armazenamento = new Armazenamento();

    public static void main(String[] args) {
        loja = new LojaBikes("Queluz", 2745, 960000000, "bica@gmail.com");
        loja.gerirBikes();
        loja.gerirClientes();
        loja.gerirFornecedores();
        
        // simular uma venda
        System.out.println("Simulação de uma venda!");
        Bike bike = loja.getBike(0);
        Cliente cliente = loja.getCliente(0);
	loja.vender(bike, cliente);
	logVenda(cliente);
        cliente = loja.getCliente(1);        
        loja.vender(bike, cliente);
	logVenda(cliente);
   
        
        
        
        // Chamada para o method Lambda
        
        System.out.println("\nPesquisa por marca e preço!");
        List<Bike> result = loja.procurarBicicletas(
                Bike -> "Orbita".equals(Bike.getMarca()) & Bike.getPreço() >0 & Bike.getPreço() <=1000);
        
        
        System.out.println(result);
        
        
        
        
        
        // Chamada para o method "Indica a contagem ex: Orbitas totais no arraylist" 
        
        System.out.println("\nTotal de Orbitas no ArrayList");
        int count = loja.getBike("Orbita");
        System.out.println("Soma das Orbitas: " + count);
        
        
        // Scanner de pesquisa de uma Marca de bicicletas
        System.out.println("\nScanner de pesquisa de uma Marca");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza a sua pesquisa: ");
        String biker = in.next();
        
        // Chamada para o method procura marca e efectua um try a ver se a condição produz resultados senão lança o catch que chama a mensagem de Exception, 
       // String bike = ("Orbita");
       // 
        try {
        ArrayList<Bike> resultados = loja.procurarMarca(biker);
        
        System.out.println(resultados);
        
        } catch(Exception problema){
             System.out.println(problema.getMessage());   
        }    
                
        
        
        
        
    }
  
    static void logVenda(Cliente cliente){
                String mensagem = "{0} comprou {1}";
		System.out.println(MessageFormat.format(mensagem, cliente.getNome(), cliente.getTransação()));
	}
}
