import java.util.*;
public class Low {

    public static void main(String[] args) {
        
        Map<String, String> dados = new HashMap<>();
        dados.put("1", "Ana Silva");
        dados.put("2", "Ana");
        dados.put("3", "Ana Clara");
        dados.put("4", "Ana flavia");
        dados.put("5", "Ana Catarina");
        dados.put("6", "Ana Joao");
        dados.put("7", "Ana Claudia");
        dados.put("8", "Ana Luiza");

        String nome = "Ana Silva";
        boolean achou = false;

        for (Map.Entry<String, String> linha : dados.entrySet()) {
         } if (linha.getValue().equalsIgnoreCase(nome)) {
                achou = true;
                break;
            }
        
    }
}
