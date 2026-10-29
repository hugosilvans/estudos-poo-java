package exemplo_collections;

import java.util.HashMap;

/** Demonstra a associação de chaves únicas aos seus valores. */
public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCidades = new HashMap<>();

        capitalCidades.put("Brasil", "Brasília");
        capitalCidades.put("Argentina", "Buenos Aires");
        capitalCidades.put("França", "Paris");

        System.out.println(capitalCidades.get("Brasil")); // Brasília

        if (capitalCidades.containsKey("Argentina")) {
            System.out.println("Argentina está no mapa.");
        } else {
            System.out.println("Argentina NÃO está no mapa.");
        }

        for (String chave : capitalCidades.keySet()) {
            System.out.println(chave + " - " + capitalCidades.get(chave));
        }
    }
}