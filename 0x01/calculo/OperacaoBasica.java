import java.nio.charset.Charset;

public class OperacaoBasica {
	
    Charset cs=Charset.forName("UTF-8");  


	public static double somar(double a, double b) {

		return a + b;
	}

	public static double subtrair(double a, double b) {

		return a - b;
	}

	public static double multiplicar(double a, double b) {

		return a * b;

	}

	public static double dividir(double a, double b) {

		return a / b;
	}

	public static double sqrt(double num) {

		return Math.sqrt(num);

	}

	public static String numero_primo(int num) {

		if (num <= 1) {

			return "Número invalido. Numero menor ou igual a 1 não é primo";
		}

		for (int j = 2; j < num; j++) {

			if (num % j == 0) {

				return "Numero válido, o numero é primo";
			}
			
		}
			
			
			
			return "Numero válido, o numero é primo";

		}
			
		}
	

	

