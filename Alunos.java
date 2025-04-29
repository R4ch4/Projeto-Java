import java.util.ArrayList;

public class Alunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Gabriel");
        alunos.add("Pedro");
        alunos.add("Tiago");
        alunos.add("João");
        alunos.add("Barquinho");

        alunos.remove(2);

        System.out.println("Alunos: " + alunos);

        System.out.println("Alunos restantes: " + alunos.size());

    }
}