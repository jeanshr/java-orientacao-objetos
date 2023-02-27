import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.println("numero: ");
			valor = scanner.nextInt();
			soma += valor;
			System.out.println("soma: " + soma);
			
		} while(valor != 0);

	}

}
