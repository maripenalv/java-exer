package curso;

import java.util.Scanner;

public class Classe3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		int nmr= sc.nextInt();
		
		for (int quant=1; quant<=nmr; quant+=1) {
			System.out.println("Digite " +nmr+ " números: ");
			int escolha= sc.nextInt();
			if(escolha >= 10 && escolha <= 20 ) {
				System.out.println("O número " +escolha+ " está entre 10 e 20");
			}
			else {
				System.out.println("O número " +escolha+ " não está entre 10 e 20" );
			}
		}
		
		sc.close();

	}

}
