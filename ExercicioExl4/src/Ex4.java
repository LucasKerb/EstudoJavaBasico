import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi;
		int hf;
		
		System.out.println("informe a hora de inicio:");
		hi = sc.nextInt();
		System.out.println("informe a hora do fim:");
		hf = sc.nextInt();
		int duracao;
		if (hi < hf) {
			duracao = hf - hi;			
		}
		else {
			duracao = 24 - hi + hf;
		}
		System.out.println("O jogo durou " + duracao + " Horas(s)");
		sc.close();
	}

}
