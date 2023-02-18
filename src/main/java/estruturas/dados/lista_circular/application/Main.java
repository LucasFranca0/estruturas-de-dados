package estruturas.dados.lista_circular.application;

import estruturas.dados.lista_circular.entities.ListaCircular;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        // adicionar um Nó pelo indice e até uma posição após o primeiro Nó(cabeça),
        // assim inserindo um Nó direto na cabeça da Lista
        minhaListaCircular.add(0, "c0");
        minhaListaCircular.add(1, "c1");
        minhaListaCircular.add(2, "c2");
        minhaListaCircular.add(3, "c3");
        minhaListaCircular.add(4, "c4");
        minhaListaCircular.add(5, "c5");

        // adiciona um Nó no final da lista(cauda)
        minhaListaCircular.add("c6");
        minhaListaCircular.add("c7");
        minhaListaCircular.add("c8");
        minhaListaCircular.add("c9");
        minhaListaCircular.add("c10");
        System.out.println(minhaListaCircular);


        // pega o conteúdo de um Nó pelo indice
        System.out.println(minhaListaCircular.get(4));

        for (int i = 0; i < minhaListaCircular.size(); i++) {
            System.out.println(minhaListaCircular.get(i));
        }

        // remove um Nó pelo indice
        minhaListaCircular.remove(5);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(1);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(2);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(6);
        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.get(minhaListaCircular.size() - 1));
    }
}