package tareanodual.egit;

public class CalculadoraParaGit {

	public CalculadoraParaGit() {
		
	}
	public  double suma(double op1, double op2) {
		return (op1 + op2);
		
	}
	public  double resta(double op1, double op2) {
		return (op1 - op2);
		
	}
	public  double multiplicacion(double op1, double op2) {
		return (op1 * op2);
		
	}
	public  double division(double op1, double op2) {
		return (op1 / op2);
		
	}

	public static void main(String[] args) {
	
		CalculadoraParaGit calc = new CalculadoraParaGit();
		System.out.println(calc.suma(225, 25));
}
	}