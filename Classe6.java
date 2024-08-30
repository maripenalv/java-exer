package curso;

import java.util.Scanner;

public class Classe6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int nmr = sc.nextInt();
        
        int fatorial = 1;  
        
        for (int i = 1; i <= nmr; i++) {
            fatorial *= i;  
        }
        
        System.out.println("O fatorial do número " + nmr + " é igual a " + fatorial);
        
        sc.close();
    }

}
