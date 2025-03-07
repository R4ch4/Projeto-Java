import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade, tempoIdade;
        double altura, alturaCalculada;

        //Solicitando o nome do usuário
        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();
        //Solicitando a idade do usuário
        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();
        //Solicitando a altura do usuário
        System.out.println("Qual a sua altura");
        altura = entrada.nextDouble();

        // Monstando uma mensagem de boas vindas
        System.out.print("Olá, " + nome + "! ");

        // Calcular tempo para 50 anos e exibir mensagem
        tempoIdade = 50 - idade;
        System.out.println("Em " + tempoIdade + " anos você terá 50 anos.");

        //Calcular altura e exibir mensagem
        alturaCalculada = altura * 100;
        System.out.println("Sua altura em cm é: " + alturaCalculada + " cm");

        entrada.close();

    }
}