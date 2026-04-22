import java.util.Scanner; 

    public class Main  { 
        public static void main(String args[]) { 
     Scanner scanner = new Scanner(System.in);
      
     System.out.print("Digite o valor de a: ");
     double a = scanner.nextDouble();

     System.out.print("Digite o valor de b: ");
     double b = scanner.nextDouble();

     System.out.print( "Digite o valor de x: ");
     double x = scanner.nextDouble();

     System.out.print( "Digite o valor de c: ");
     double c = scanner.nextDouble();

     double y = a * ( x * x ) + b * c;

     System.out.print("O valor do y é: " + y);

     scanner.close();

     } 
}    
        