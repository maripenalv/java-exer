package curso;

import java.util.Scanner;

public class Classe5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite a quantidade de casos de teste: ");
		int casos = sc.nextInt();
		
		for (int i=0; i<casos; i++) {
			System.out.println(+(i+1)+"o caso de teste");
			
			System.out.print("Digite o primeiro número: ");
			int nmr1 = sc.nextInt();
			System.out.print("Digite o segundo número: ");
			int nmr2= sc.nextInt();
			float media = (nmr1/nmr2);
			
			
			if (media==0 || nmr2 == 0){
				System.out.print("Operação não concluída");
				System.out.println();
;			}
			
			else {
				System.out.printf("A média foi igual a %.2f\n", media);
				System.out.println();
			}
		}
		
		sc.close();

	}

}
