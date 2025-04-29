public class CaixaEletronico {
    public static void main(String[] args) {

        Banco meuBanco = new Banco();


        ContaBancaria conta1 = new ContaBancaria("7623-1", "Thaina Rocha");
        ContaBancaria conta2 = new ContaBancaria("2687-5", "Gabriel Rocha");
        ContaBancaria conta3 = new ContaBancaria("5476-3", "Theu Rocha");

        meuBanco.adicionarConta(conta1);
        meuBanco.adicionarConta(conta2);
        meuBanco.adicionarConta(conta3);

        System.out.println("\n--- Operações ---");


        ContaBancaria contaThaina = meuBanco.buscarConta("7623-1");
        if (contaThaina != null) {
            contaThaina.depositar(200.00);
        }

        ContaBancaria contaGabriel = meuBanco.buscarConta("2687-5");
        if (contaGabriel != null) {
            contaGabriel.depositar(50.75);
        }


        if (contaGabriel != null) {
            contaGabriel.sacar(20.00);
        }

        ContaBancaria contaTheu = meuBanco.buscarConta("5476-3");
        if (contaTheu != null) {
            contaTheu.sacar(100.00);
        }


        if (contaThaina != null) {
            contaThaina.sacar(12.00);
        }


        meuBanco.listarContas();
    }
}