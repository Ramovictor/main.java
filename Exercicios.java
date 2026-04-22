import java.util.Scanner;
public class Exercicios {
    public static void main(String args[]) {
        
        }
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Esse programa verifica se o idiota, burro do aluno foi aprovado");
        System.out.println("Entre com a primeira nota: ");
        double nota1 = Leitor.nextInt();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = Leitor.nextInt();
        Leitor.nextLine();

        double media = (nota1 + nota2)/ 2;

        if (media < 6) {
            System.out.println("reprovado");
            }
        if (media > 6) {
            System.out.println("aprovado");
        }   
         if (media == 10) {
            System.out.println("aprovado com estrelinha");
            
        }

      Leitor.close();
    }
}
