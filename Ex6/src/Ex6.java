import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		double pi;
		pi = 3.14159;
		double areaTri;
		double areaCircl;
		double areaTrap;
		double areaQuad;
		double areaRet;
		System.out.println("Insira o valor de A:");
		A = sc.nextDouble();
		System.out.println("Insira o valor de B:");
		B = sc.nextDouble();
		System.out.println("Insira o valor de C:");
		C = sc.nextDouble();
		areaTri = A * C / 2;
		areaCircl = pi * C * C;
		areaTrap = (A + B) * C / 2;
		areaQuad = B * B;
		areaRet = A * B;
		System.out.printf("Triangulo: %.3f%n", areaTri);
		System.out.printf("Circulo: %.3f%n", areaCircl);
		System.out.printf("Trapezio: %.3f%n", areaTrap);
		System.out.printf("Quadrado: %.3f%n", areaQuad);
		System.out.printf("Retangulo: %.3f%n", areaRet);
		
		
		
		
		sc.close();

	}

}
