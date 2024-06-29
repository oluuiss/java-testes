package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4salario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double hora, vhora;
		
		System.out.printf("Digite o número do funcionário: ");
		numero = sc.nextInt();
		System.out.printf("Digite as horas trabalhadas do funcionário: ");
		hora = sc.nextDouble();
		System.out.printf("Digite o valor que ele receberá por hora trabalhada: ");
		vhora = sc.nextDouble();
		
		System.out.println("\nNúmero do funcionário: " + numero);
		double salario = vhora*hora;
		System.out.printf("Salário do funcionário: %.2f", salario);
		
	}

}