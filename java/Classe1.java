package curso;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 1000: ");
		int x= sc.nextInt();
		
		if (x<1 || x > 1000){
		 System.out.println("O número escolhido está fora do intervalo");
		}
		
		else {
			System.out.println("O número escolhido foi: " +x);
		} 
			if (x % 2==0) {
				System.out.print("O número é par");
			}
			
			else {
				System.out.println("O número é ímpar");
			}
		
		
		
		sc.close();
	}

}
