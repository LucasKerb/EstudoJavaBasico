import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//Caso com if e else
		// double preco = 34.5;
		// double desconto;
		// if (preco < 20.0) {
		// desconto = preco * 0.1;
		// }
		// else {
		// desconto = preco * 0.05;
		// }
		
		//Expressao ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		sc.close();

	}

}
