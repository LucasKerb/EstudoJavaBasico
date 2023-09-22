import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("Digite o primeiro numero:");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		y = sc.nextInt();
		if(x % y == 0 || y % x == 0) {
			System.out.println(x + " E " + y + ": Sao Multiplos");
		}
		else {
			System.out.println(x + " E " + y + ": Nao sao Multiplos");
		}
		
		
		
		sc.close();
	}

}
