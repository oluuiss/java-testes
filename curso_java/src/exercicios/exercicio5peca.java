package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5peca {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c1, n1, v1, c2, n2, v2, calculo = 0;
		
		System.out.printf("Digite o código da primeira peça: ");
		c1 = sc.nextDouble();
		System.out.printf("Digite o número de peças: ");
		n1 = sc.nextDouble();
		System.out.printf("Digite valor unitário de cada peça: ");
		v1 = sc.nextDouble();
		System.out.println("\n----------------------------------------\n");
		System.out.printf("Digite o código da segunda peça: ");
		c2 = sc.nextDouble();
		System.out.printf("Digite o número de peças: ");
		n2 = sc.nextDouble();
		System.out.printf("Digite valor unitário de cada peça: ");
		v2 = sc.nextDouble();
		System.out.printf("\n----------------------------------------\n\n");
		
		calculo = (n1*v1)+(n2*v2);
		System.out.printf("Valor total a pagar: %.2f", calculo);
	}

}