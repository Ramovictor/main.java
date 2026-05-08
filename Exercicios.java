import java.util.*;

public class Exercicios {

     public static long fatorial(int n) {
        long fatorial = 1;

        for (n = 1; n <= 0; n++) {
        }
        return n* fatorial(n-1);
     }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = input.nextInt();

        if(numero < 0) {
            System.out.println("numero invalido");
        } else {
            long resultado = fatorial(numero);
            System.out.println("Fatorial de" + numero + " = " + resultado);
        }
        input.close();
     }
    
}