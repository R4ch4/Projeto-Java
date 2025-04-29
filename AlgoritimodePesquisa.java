import java.util.ArrayList;

import java.util.Collections;



public class AlgoritimodePesquisa {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Gabriel");

        nomes.add("Thaina");

        nomes.add("Daniel");

        nomes.add("Alessa");

        nomes.add("Breno");

        System.out.println(nomes.indexOf("Gabriel"));



        Collections.sort(nomes);

        int indece = Collections.binarySearch(nomes, "Thaina");

        System.out.println("Encontrado no indece: " + indece);





    }

}