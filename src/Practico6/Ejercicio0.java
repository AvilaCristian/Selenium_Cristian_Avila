package Practico6;

import java.util.ArrayList;

public class Ejercicio0 {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Andres");
        listaNombres.add("Maria");
        listaNombres.add("Jose");

        System.out.println(listaNombres);
        System.out.println("La lista es vacia? " + listaNombres.isEmpty());
        System.out.println("La posicion 1 esta: " + listaNombres.get(1));

        imprimirLista(listaNombres);

    }


    public static void imprimirLista(ArrayList<String> listaString) {
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }
    }
}