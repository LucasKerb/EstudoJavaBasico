import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		int quant;
		double total = 0;

		System.out.println("Informe o codigo do produto:");
		code = sc.nextInt();
		System.out.println("Informe a quantidade desejada:");
		quant = sc.nextInt();
		if(code == 1) {
			total = quant * 4.0;
		}
		else if(code == 2) {
			total = quant * 4.5;
		}
		else if(code == 3) {
			total = quant * 5.0; 
		}
		else if(code == 4) {
			total = quant * 2.0;
		}
		else if(code == 5) {
			total = quant * 1.5;
		}
		System.out.printf("Total: R$%.2f%n", total);
		sc.close();
	}
}
