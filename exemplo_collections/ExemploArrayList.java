package exemplo_collections;

import java.util.ArrayList;

/** Demonstra uma lista com ordem de inserção e elementos repetidos. */
public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Ana");
        listaNomes.add("Bruno");
        listaNomes.add("Carla");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }

        if (listaNomes.contains("Bob")) {
            System.out.println("Bob está na lista.");
        }

        listaNomes.remove("Bruno");

        if (!listaNomes.contains("Bob")) {
            System.out.println("Bob NÃO está na lista.");
        }

        if (listaNomes.isEmpty()) {
            System.out.println("A lista está vazia.");
        }

        listaNomes.clear();

        if (listaNomes.isEmpty()) {
            System.out.println("A lista está vazia.");
        }
    }
}
