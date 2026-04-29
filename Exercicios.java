import java.util.Scanner; 
public class Exercicios {
    public static void main(String args[]) {
        
        
        Scanner Leitor = new Scanner(System.in);
        int[] numeros = new int[20]; // vetor com 20 posições

        //Lendo os 20 números
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero" + (i + 1) + ": ");
            numeros[i] = Leitor.nextInt();
        }
        // Exibindo os números digitados
        System.out.println("n/Numeros digitados: ");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

      Leitor.close();
    }
}
