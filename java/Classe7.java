package curso;

import java.util.Scanner;

public class Classe7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int nmr= sc.nextInt();
		
		for (int i=1; i<=nmr; i++) {
			if (nmr%i==0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
