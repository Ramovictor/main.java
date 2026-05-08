import java.util.*;

public class Trabalhofinal {

    static void registrarItem() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> produtos = new HashMap<>();
        Map<String, Integer> vendas = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar produto: ");
            System.out.println("2 - Atualizar preço: ");
            System.out.println("3 - Registrar venda: ");
            System.out.println("4 - Listar produtos: ");
            System.out.println("5 - Exibir produto mais vendido");
            System.out.println("6 - Exibir produto com maior receita: ");
            System.out.println("7 - Exibir faturamento total: ");
            System.out.println("8 - Exibit total de transações: ");
            System.out.println("9 - Exibir ticket medio: ");
            System.out.println("0 - Encerrar programa: ");
            System.out.print("\n\nDigite a sua escolha: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;

            switch (choice) {
                case 1:
                    System.out.println("\nInserir o nome do produto: ");
                    String itemName = scanner.nextLine();

                    System.out.println("Inserir o valor do produto: ");
                    double valor = scanner.nextDouble();

                    produtos.put(itemName, valor);

                    break;
                case 2:
                  System.out.println("\nDigite o nome do produto para atualizar o preço: ");
                  String itemItem = scanner.nextLine();

                  if (produtos.containsKey(itemItem)) {
                    System.out.println("Digite o novo valor: ");
                    double novoValor = scanner.nextDouble();

                    produtos.put(itemItem, novoValor);
                    System.out.println("\nPreço atualizado com sucesso!");
                    
                  } else {

                    System.out.println("\nProduto não encontrado!");
                  }
                    break;
                case 3:
                    System.out.println("\nInsira o nome do produto que deseja vender: ");
                     itemName = scanner.nextLine();

                   if (!produtos.containsKey(itemName)){
                        System.out.println("Esse produto não existe!");
                   }
                    

                   System.out.println("A quantidade vendida: ");
                   int itemQtd = scanner.nextInt();
                   scanner.nextLine();

                   if(vendas.containsKey(itemName)){
                      int atualQtd = vendas.get(itemName);

                      vendas.put(itemName, itemQtd + atualQtd);
                   }else{
                        vendas.put(itemName, itemQtd);
                   }
                    break;
                case 4:
                    for(String key: produtos.keySet()) {
                        System.out.println("\nNome do item: " + key + ", valor do item: R$ " + produtos.get(key));
                    }
                    break;
                case 5:
                    String maisVend = null;
                    int maiorQ = 0;

                    for( String key: vendas.keySet()){
                        itemQtd = vendas.get(key);
                        if(itemQtd > maiorQ){

                            maiorQ = itemQtd;
                            maisVend = key;
                        }
                    }

                    if(maiorQ > 0){
                        System.out.println("Produto mais vendido: " + maisVend);
                        System.out.println("Quantidade vendida: " + maiorQ);
                    } else{
                        System.out.println("Nenhuma venda resgitrada.");
                    }
                    break;
                case 6:
                    String PMRec = "";
                    double maiorRec = 0;

                    for(String key: vendas.keySet()){
                        int quantidadeVend = vendas.get(key);

                        double precoP = produtos.get(key);

                        double receita = quantidadeVend * precoP;

                        if (receita > maiorRec) {
                            
                            maiorRec = receita;
                            PMRec = key;

                        }
                    }

                    if(maiorRec > 0) {

                        System.out.println("Produto com maior receita: " + PMRec);
                        System.out.println("Receita total: " + maiorRec);

                    } else{
                        System.out.println("Nenhuma venda registrada.");
                    }

                    break;
                case 7:
                    double faturamentoTotal = 0;

                    for(String key: vendas.keySet()){
                        
                        int quantidadeVend = vendas.get(key);    
                        
                        double precoP = produtos.get(key);

                        faturamentoTotal += quantidadeVend * precoP;
                    }
                    System.out.println("Faturamento total: R$ " + faturamentoTotal);
                    break;
                case 8:
                    int totalTrans = vendas.size();
                        System.out.println("Total de de transações: " + totalTrans);
                    break;
                case 9:
                    double faturamentoT = 0;
                    totalTrans = 0;

                    for(String key: vendas.keySet()){
                        int quantidadeVend = vendas.get(key);
                        double precoP = produtos.get(key);
                        
                        totalTrans += quantidadeVend * precoP;
                    }
                    if (totalTrans > 0){
                        double tickteM = faturamentoT / totalTrans;
                        System.out.println("Ticket  médio: R$ " + tickteM);
                    } else {
                        System.out.println("Nenhuma venda registrada.");
                    }
                    break;
                default:
                    break;

            }
        }

        scanner.close();
    }

}
