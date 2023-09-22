import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		System.out.println("Indique o valor de x:");
		x = sc.nextDouble();
		System.out.println("Indique o valor de y:");
		y = sc.nextDouble();
		if(x == 0 && y == 0) {
			System.out.println("X = " + x + " E Y = " + y + " : ORIGEM");			
		}
		else if(x == 0.0) {
			System.out.println("Eixo y");
		}
		else if(y == 0.0) {
			System.out.println("Eixo x");
		}
		else if(x > 0.0 &&  y > 0.0 ) {
			System.out.println("X = " + x + " E Y = " + y + " : Q1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("X = " + x + " E Y = " + y + " : Q2");
		}
		else if(x < 0.0  && y < 0.0 ) {
			System.out.println("X = " + x + " E Y = " + y + " : Q3");
		}
		else {
			System.out.println("X = " + x + " E Y = " + y + " : Q4");
		}
	
		
		
		sc.close();
	}

}
