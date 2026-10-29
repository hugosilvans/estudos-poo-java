package exemplo_collections;

import java.util.ArrayList;
import java.util.HashSet;

/** Demonstra um conjunto sem elementos duplicados e sem ordem garantida. */
public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<Integer> inteiros = new HashSet<>();

        listaNomes.add("Ana");
        listaNomes.add("Bruno");
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(3); // Tentativa de adicionar duplicata

        for (Integer i : inteiros) {
            System.out.println(i);
        }

        inteiros.remove(3);

        if (inteiros.contains(3)) {
            System.out.println("3 está na lista.");
        } else {
            System.out.println("3 NÃO está na lista.");
        }
    }
}