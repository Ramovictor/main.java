import java.util.*;

public class Exercicios {

     public static long fatorial(int i) {
        long resultado = 1;

        for (i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
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