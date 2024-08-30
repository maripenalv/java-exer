package curso;

import java.util.Scanner;

public class Classe4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de casos de teste: ");
        int quant = sc.nextInt();
        
        for (int x = 0; x < quant; x++) { 
        	System.out.println("Esse é o " + (x + 1) + "º caso de teste");
            
            System.out.print("Escolha o 1º número: ");
            float nmr1 = sc.nextFloat();
            System.out.print("Escolha o 2º número: ");
            float nmr2 = sc.nextFloat();
            System.out.print("Escolha o 3º número: ");
            float nmr3 = sc.nextFloat();
            
            float media = (nmr1* 2)+(nmr2*3)+(nmr3*5)/2+3+5;
            System.out.print("A média do " +(x + 1)+ " caso foi: " +media);
       
            
        }
        
        sc.close();
    }

}
