import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double horas;
		double valorHora;
		double valorFinal;
		
		System.out.println("Digite o numero do funcionario:");
		n = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas:");
		horas = sc.nextDouble();
		System.out.println("Digite o quanto o funcionario recebe por hora trabalhada:");
		valorHora = sc.nextDouble();
		valorFinal = horas * valorHora;
		System.out.println("NUMERO: " + n);
		System.out.printf("SALARIO: R$ %.2f%n", valorFinal);
		sc.close();
	}

}
