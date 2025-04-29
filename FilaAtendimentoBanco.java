import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimentoBanco {

    private Queue<Integer> fila = new LinkedList<>();
    private ArrayList<Integer> historicoAtendidos = new ArrayList<>();
    private int proximoNumero = 1;

    public int gerarNumero() {
        fila.add(proximoNumero);
        return proximoNumero++;
    }

    public Integer atenderProximo() {
        if (!fila.isEmpty()) {
            int clienteAtendido = fila.poll();
            historicoAtendidos.add(clienteAtendido);
            return clienteAtendido;
        } else {
            return null; // Fila vazia
        }
    }

    public void exibirFila() {
        System.out.println("Fila de atendimento: " + fila);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de atendidos: " + historicoAtendidos);
    }

    public static void main(String[] args) {
        FilaAtendimentoBanco banco = new FilaAtendimentoBanco();

        int numero1 = banco.gerarNumero();
        System.out.println("Cliente chegou, número: " + numero1);
        int numero2 = banco.gerarNumero();
        System.out.println("Cliente chegou, número: " + numero2);
        banco.exibirFila();

        Integer atendido1 = banco.atenderProximo();
        System.out.println("Cliente atendido, número: " + atendido1);
        banco.exibirFila();
        banco.exibirHistorico();

        Integer atendido2 = banco.atenderProximo();
        System.out.println("Cliente atendido, número: " + atendido2);
        banco.exibirFila();
        banco.exibirHistorico();

        Integer atendido3 = banco.atenderProximo();
        if (atendido3 == null) {
            System.out.println("Fila vazia.");
        }
    }
}