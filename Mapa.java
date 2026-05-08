import java.util.*; 
    

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> alunos = new HashMap<>();

        alunos.put("João", 18);
        alunos.put("Pedro",  25);
        alunos.put("Ramon", 16);

        for(String nome : alunos.keySet()) {
            System.out.println(nome + " tem " + alunos.get(nome) + " anos");

        }

        Map<String, Integer> cidade = new HashMap<>();

        cidade.put("São Paulo", 11000000);
        cidade.put("Aracaju", 630000);
        cidade.put("Salvador", 2500000);

        String cidadeBusca = "Aracaju";
             if (cidade.containsKey(cidadeBusca)) {
                System.out.println("A população de " + cidadeBusca + "é de: " + cidade.get(cidadeBusca));
             } else {
                System.out.println("Cidade não encontrada");
             }

        Map<String, Double> produto = new HashMap<>();

        produto.put("Escova", 30.00);
        produto.put("Calça", 75.00);
        produto.put("tenis", 89.00);

        //Atualização de preços
        produto.put("Calça", 100.00);

        System.out.println("Novo preço do Calça é: " + produto.get("Calça"));

        Set<String> nomes = new HashSet<>();
        Scanner input = new Scanner(System.in);

         nomes.add("Ramon");
         nomes.add("João");
         nomes.add("Pedro");
         nomes.add("Gabriel");

         System.out.println("Digite o nome: ");
         String nome = input.nextLine();
          
         if (nomes.contains(nome)) {
            System.out.println("Ja passou por aqui");
         } else {
            System.out.println("Acesso permitido");
            nomes.add(nome);
         }

         
         input.close();
    }
}

