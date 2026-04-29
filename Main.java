     public class Main  { 
        public static void main(String args[]) {
            
      int n = 13;
      int resultado = 0;
      int num1 = 1;
      int num2 = 2;

      for(int i = 0; i < n; i++) {
        System.out.println(num1 + " ");
        resultado = num1 + num2;

        num1 = num2;
        num2 = resultado;
      }
     
    

     } 
}    
        