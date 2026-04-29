import java.util.Scanner;
public class Arquivo {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        // Array ja definido
        int[] num = {1, 3, 4, 5, 5, 7, 8, 8, 9, 10};

        // Entrada do usuario 
        System.out.print("Digite um numero: ");
        int choice = leitor.nextInt();

        boolean hasValue = false;

        // Verificando se o numero está no Array
        for(int i = 0; i< num.length; i++) {
            if (num[i] == choice) {
                hasValue = true;
                break;
            }
        }

        // Resultado
        if(hasValue){
            System.out.println("O numero esta dentro da Array!");
        } else {
            System.out.println("O numero não esta dentro da Array");
        }
        leitor.close();
        } 
    }      