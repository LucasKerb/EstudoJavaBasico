import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y != 0) {
				double z = (x / y);
				System.out.println("%.1f%n"+z);
			} else {
				System.out.println("Divisao impossivel");
			}

		}

		sc.close();
	}

}