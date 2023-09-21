import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		System.out.println("Digite os valores necessarios para o calculo:");
		System.out.println("Digite o valor de A:");
		A = sc.nextInt();
		System.out.println("Digite o valor de B:");
		B = sc.nextInt();
		System.out.println("Digite o valor de C:");
		C = sc.nextInt();
		System.out.println("Digite o valor de D:");
		D = sc.nextInt();
		diferenca = (A*B-C*D);
		System.out.printf("DIFERENCA= %d%n", diferenca);





		sc.close();
	}
}