public class Produto {
    Descricao descricao;
    protected double preco;
    protected int quantidadeEstoque;

    public Produto(Descricao descricao, double preco, int quantidadeEstoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String toString(){
        String produto = "";
        produto = "=======######=======\n";
        produto = produto + "Descricao do Item:" + descricao + "\n";
        produto = produto + "Preço: " + preco + "\n";
        produto = produto + "Quant em Estoque: " + quantidadeEstoque + "\n";
        produto = produto + "=======######=======\n";
        return produto;
    }
    public String getDescricao() {
        return descricao.toString();
    }
}
