import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.println("Valor de x: " + x + " Metros");
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("Resultado = %.4f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);
	
		
		
		
		Locale.setDefault(Locale.US);

	}

}
