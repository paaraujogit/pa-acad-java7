package pa.calc;

public class Oper03 implements ItfOper {

	/**
	 * Calcula a divisão
	 */
	@Override
	public double oper(double op1, double op2) {
		
		if ( op2 != 0.0) return op1 / op2;
		
		return 0; // TODO: devolver um valor em consonacia com o erro
	}
}