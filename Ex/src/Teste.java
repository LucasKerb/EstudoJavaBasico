
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.printf("Digite o primeiro numero: %n");
		x = sc.nextInt();
		System.out.printf("Digite o segundo numero: %n");
		y = sc.nextInt();
		z = x+y;
		System.out.println("SOMA = " + z);




		sc.close();
	}
}
