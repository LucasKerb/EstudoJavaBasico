import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor Digite sua senha:");
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha invalida, acesso negado");
			System.out.println("Por favor digite novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();

	}

}