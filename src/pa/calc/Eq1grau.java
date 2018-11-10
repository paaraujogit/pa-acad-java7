package pa.calc;

public class Eq1grau {
	
	public double x1(double a, double b, double c ) {
	
		double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		
		return x1;
	}
	
	public double x2(double a, double b, double c ) {
		
		double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		
		return x2;
	}
}
