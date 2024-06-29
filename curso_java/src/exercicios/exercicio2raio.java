package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2raio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = 0;
		
		System.out.printf("Digite o valor do raio: ");
		raio = sc.nextDouble();
		double calculo = pi * (raio*(raio));
		System.out.printf("O valor do raio é: %.4f", calculo);
	}

}