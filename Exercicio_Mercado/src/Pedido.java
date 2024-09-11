import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    TipoPagamento pagamento;
    Cliente cliente;
    ArrayList<Item> itens = new ArrayList<>();
    Scanner inputQtd = new Scanner(System.in);
    Scanner nomeProduto = new Scanner(System.in);
    Scanner inputName = new Scanner(System.in);
    Scanner inputCPF = new Scanner(System.in);
    int opcao,quantidade;

    public Pedido() {

    }
    public Pedido(TipoPagamento pagamento, ArrayList<Produto> produtos) {
        this.pagamento = pagamento;
        addCliente();
        addItem(produtos);
    }

    private void addCliente(){
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = inputName.nextLine();
        System.out.println("Digite o CPF do cliente");
        String cpfCliente = inputCPF.nextLine();
        cliente = new Cliente(nomeCliente, cpfCliente);
    }

    private void addItem(ArrayList<Produto> produtos) {
        do {
            System.out.println("Menu Itens\n");
            System.out.println("1 - Adicionar Item");
            System.out.println("2 - Remover Item");
            System.out.println("3 - Voltar para o Menu Principal");
            opcao = inputQtd.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nomeItem = nomeProduto.nextLine();
                    System.out.println("Digite a quantidade do item: ");
                    quantidade = inputQtd.nextInt();
                    Produto produtoEncontrado = null;
                    for (Produto produto : produtos) {
                        if (produto.getDescricao().equals(nomeItem)) {
                            produtoEncontrado = produto;
                            break;
                        }
                    }

                    if (produtoEncontrado != null) {
                        if((produtoEncontrado.quantidadeEstoque - quantidade)>=0) {
                            produtoEncontrado.quantidadeEstoque -= quantidade;
                            itens.add(new Item(quantidade, produtoEncontrado));
                        }else{
                            System.out.println("Quantidade indisponivel no estoque!!!");
                        }
                    } else {
                        // Tratamento caso o produto não seja encontrado
                        System.out.println("Produto não encontrado.");
                    }


                    //itens.add(new Item(quantidade,produtos.get(produtos.indexOf(nomeItem))));
                    break;
            }

        }while (opcao != 3);
    }
    protected void realizarPagamento() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += (item.produto.preco * item.quantidade);
        }
        System.out.println("O valor total pago foi de R$ " + valorTotal);
    }
}