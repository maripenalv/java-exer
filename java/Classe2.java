package curso;

import java.util.Scanner;

public class Classe2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escolha um número: ");
	int nmr = sc.nextInt();
	System.out.println("O número escolhido foi " +nmr);
	
	for (int numero=0; numero<=nmr; numero++) {
		if (numero % 2 != 0) {
			System.out.println("Os números ímpares de 0 a " +nmr+ " foram: " +numero);
		}
	}

	sc.close();;
}
}
