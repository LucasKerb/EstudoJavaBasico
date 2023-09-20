import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEntrada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String x;
		int y;
		Double z;
		System.out.println("Digite algo.");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		System.out.println("Voce digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
