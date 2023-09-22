import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite o numero:");
		x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println(x +": PAR");
		}
		else {
			System.out.println(x +": IMPAR");
		}
		sc.close();
	}

}
