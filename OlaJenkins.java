public class OlaJenkins {
	static int j =20, m = 10, z = 0;
	static double result;
    public static void main(String[] args) {
        // Prints "Olá Jenkins!" to the terminal window.
        System.out.println("Olá Jenkins!");
        System.out.println(divisao(j, m));
        System.out.println(divisao(j, z));
    }
    
    public static double divisao(int x , int y) {
    	
    	try{
    	    result = x/y;
    	    } 
    	    catch(ArithmeticException e){
    	        System.out.print("Erro: divisão por zero!");
    	    }
		return result;
    	
    }       
    
}
