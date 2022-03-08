import java.nio.charset.Charset;

public class OperacaoBasica {

	Charset cs = Charset.forName("UTF-8");

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

			return "Numero invalido. Numero menor ou igual a 1 e primo";
		}

		for (int j = 2; j < num; j++) {

			if (num % j == 0) {

				return "Numero valido, mas nao e primo";
			}

		}

		return "Numero valido, o numero e primo";

	}

}
