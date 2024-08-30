package curso;

import java.util.Scanner;

public class Classe8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int teste= 0b100000;
        System.out.print("Escolha um número: ");
        int nmr= sc.nextInt();
        
        if ((nmr & teste) != 0){
        	System.out.print("O sexto bit é igual a 1(verdadeiro)");
        }
        
        else {
        	System.out.print("O sexto bit é 0(falso)");
        }
        
        sc.close();
    }
}
