package estrutura_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora, por favor!");
		int hora = scanner.nextInt();
		
		
		if( hora > 0 && hora < 12 ) {
			System.out.println("Bom dia!");
		}
		else if( hora >= 12 && hora <= 18 ) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}

	}

}
