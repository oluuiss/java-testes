package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio1soma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.printf("Digite o primeiro número para soma: ");
		x = sc.nextInt();
		
		System.out.printf("Digite o segundo número para soma: ");
		y = sc.nextInt();
			
		int soma = x+y;
			System.out.printf("A soma de %d + %d é %d", x, y, soma);
		
	}

}