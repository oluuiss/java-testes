package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio6area {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double triangulo, circulo, trapezio, quadrado, retangulo, a, b, c;
		double pi = 3.14159, raio;
		
		System.out.printf("Digite o valor A: ");
		a = sc.nextDouble();
		System.out.printf("Digite o valor B: ");
		b = sc.nextDouble();
		System.out.printf("Digite o valor C: ");
		c = sc.nextDouble();
		
		triangulo = a*c/2;
		System.out.printf("\nTRIANGULO: %.3f\n", triangulo);
		circulo = pi*(c*(c));
		System.out.printf("CIRCULO: %.3f\n", circulo);
		trapezio = (a+b)*c/2;
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		quadrado = b*b;
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		retangulo = a*b;
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}

}