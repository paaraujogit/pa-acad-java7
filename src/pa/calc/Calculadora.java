package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opEx = new OperEx();
		double resEx = opEx.oper(1, 3);
		System.out.println(resEx);
		
		// Oper02 - Solution
		Oper02 op02 = new Oper02();
		double res02 = op02.oper(10, 2);
		System.out.println(res02);

	}

        public double soma(double num1, double num2){
          return num1+num2;
           
        }

}
