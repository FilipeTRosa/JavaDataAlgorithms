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
            System.out.println("3 - Sair");
            opcao = inputQtd.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nomeItem = nomeProduto.nextLine();
                    System.out.println("Digite a quantidade do item: ");
                    quantidade = inputQtd.nextInt();
                    itens.add(new Item(quantidade,produtos.get(produtos.indexOf(nomeItem))));
                    break;
            }

        }while (opcao != 3);
    }
}