import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = 1;

		for (int i = 1; i <= N; i++) {
			F = F * i;
		}
		System.out.println(F);

		sc.close();

	}

}
