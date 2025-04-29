public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }

    public double calcularTotal() {
        return this.preco * this.quantidade;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 14.99, 22);
        Produto produto2 = new Produto("Calça Jeans", 50, 22);


        System.out.println("Detalhes do Produto 1:");
        produto1.exibirDetalhes();
        double totalProduto1 = produto1.calcularTotal();


        System.out.println("Detalhes do Produto 2:");
        produto2.exibirDetalhes();
        double totalProduto2 = produto2.calcularTotal();


        double totalGeral = totalProduto1 + totalProduto2;

    }
}