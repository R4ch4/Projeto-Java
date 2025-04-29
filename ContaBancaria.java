import java.util.ArrayList;
import java.util.List;

class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " na conta " + this.numeroConta + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido para a conta " + this.numeroConta + ".");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " da conta " + this.numeroConta + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido na conta " + this.numeroConta + ".");
            return false;
        }
    }

    public void exibirResumo() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
        System.out.println("--------------------");
    }
}

class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
        System.out.println("Conta " + conta.getNumeroConta() + " adicionada com sucesso.");
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : this.contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        System.out.println("Conta " + numeroConta + " não encontrada.");
        return null;
    }

    public void listarContas() {
        System.out.println("\n--- Listagem de Contas ---");
        if (this.contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (ContaBancaria conta : this.contas) {
                conta.exibirResumo();
            }
        }
    }
}
