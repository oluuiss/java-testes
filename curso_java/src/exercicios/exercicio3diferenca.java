package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3diferenca {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		int diferenca = 0;
		
		System.out.printf("Digite o valor do A: ");
		a = sc.nextInt();
		System.out.printf("Digite o valor do B: ");
		b = sc.nextInt();
		System.out.printf("Digite o valor do C: ");
		c = sc.nextInt();
		System.out.printf("Digite o valor do D: ");
		d = sc.nextInt();
		
		
		System.out.printf("A diferença entre A, B, C, D é: " + (a*b-c*d));
		
	}

}