
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double raio, area, pi = 3.14159;
		
		System.out.printf("Sistema para calcular area de um circulo%nDigite o valor do raio do circulo:");
		raio = sc.nextDouble();
		area = pi * (raio * raio);
	    System.out.printf("Area = %.4f", area);
	

		




	sc.close();
}
}
