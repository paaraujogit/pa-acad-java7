package pa.calc;

/**
 * Calculadora ###
 * @author Grupo RUMOS
 *
 */

public class Calculadora {

    public static void main(String[] args){
        // OperEx Example
        OperEx opEx = new OperEx();
        double resEx = opEx.oper(1, 3);
        System.out.println(resEx);

        // Oper02 - Solution
        Oper02 op02 = new Oper02();
        double res02 = op02.oper(10, 2);
        System.out.println(res02);

        // Oper03 - Solution
        Oper03 op03A = new Oper03();
        double res03A = op03A.oper(10, 2);
        System.out.println(res03A);
        
        // Eq1grau
        double a = 5;
        double b = 2;
        double c = 1;
        Eq1grau eq1grau = new Eq1grau();
        double x1 = eq1grau.x1(a, b, c);
        double x2 = eq1grau.x2(a, b, c);
        System.out.println(x1 + " ou " + x2);

    }
}
