public class OlaJenkins {
	static int j =20, m = 10, z = 0;
	static double result;
    public static void main(String[] args) {
        // Prints "Ol� Jenkins!" to the terminal window.
        System.out.println("Ol� Jenkins!");
        System.out.println(divisao(j, m));
        System.out.println(divisao(j, z));
    }
    
    public static double divisao(int x , int y) {
    	
    	try{
    	    result = x/y;
    	    } 
    	    catch(ArithmeticException e){
    	        System.out.print("Erro: divis�o por zero!");
    	    }
		return result;
    	
    }       
    
}
