import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codeP1;
		int numeroP1;
		double valorP1;
		int codeP2;
		int numeroP2;
		double valorP2;
		double somaFinal;
		System.out.println("Digite o codigo da peca 1:");
		codeP1 = sc.nextInt();
		System.out.println("Digite a quantidade de pecas:");
		numeroP1 = sc.nextInt();
		System.out.println("Digite o valor pago por cada peca:");
		valorP1 = sc.nextDouble();;
		System.out.println("Digite o codigo da peca 2:");
		codeP2 = sc.nextInt();
		System.out.println("Digite a quantidade de pecas:");
		numeroP2 = sc.nextInt();
		System.out.println("Digite o valor pago por cada peca:");
		valorP2 = sc.nextDouble();;
		somaFinal = (valorP1 * numeroP1) + (valorP2 * numeroP2);
		System.out.printf("Valor a pagar: R$%.2f%n", somaFinal);
		
		

		
		
		
		
		
		
		
		
		
		sc.close();		
	}

}
