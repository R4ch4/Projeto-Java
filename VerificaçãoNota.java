import java.util.Scanner;

public class VerificaçãoNota {
    public static void main(String[] args) {

        int notaAluno;
        Scanner nota = new Scanner(System.in);

        System.out.println("Verificação, digite o valor de sua nota? ");
        notaAluno = nota.nextInt();

        switch(notaAluno) {
            case 10, 9:
                System.out.println("Excelente!");
                break;

            case 8, 7:
                System.out.println("Bom");
                break;
            case 6, 5:
                System.out.println("Regular");
                break;

            case 4, 3, 2, 1:
                System.out.println("Vamos se esfoçar");

            default:
                System.out.println("Reprovado!");
                break;

        }
        nota.close();
    }
}