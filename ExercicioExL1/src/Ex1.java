import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite o numero:");
		x = sc.nextInt();
		if(x < 0) {
			System.out.println(x +": NEGATIVO");
		}
		else {
			System.out.println(x +": NAO NEGATIVO");
		}
		sc.close();	
	}

}
