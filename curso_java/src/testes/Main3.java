package testes;
import java.util.Scanner;
import java.util.Locale;

public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.printf("Digite o seu nome: ");
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		
		System.out.printf("Seu nome é: " + x + "? ");
		
		char s;
		s = sc.next().charAt(0);
		if (s == 'S') {
			System.out.println("Verificamos que o seu nome está correto, prazer em conhecelo, " + x + "!");
		} else if(s == 's'){
			System.out.println("Verificamos que o seu nome está correto, prazer em conhecelo, " + x + "!");
		} else {
			System.out.println("Desculpe, tente novamente mais tarde!");
		}
		
		sc.close();
	}

}
