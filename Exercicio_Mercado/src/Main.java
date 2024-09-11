import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner inputMenu = new Scanner(System.in);
        int menu;
        Pedido pedidos = new Pedido();

        //Cadastrando Estoque
        produtos.add(new Produto(Descricao.ARROZ,22.5, 10));
        produtos.add(new Produto(Descricao.FARINHA, 15.50, 25));
        produtos.add(new Produto(Descricao.FEIJAO, 5.80, 50));
        produtos.add(new Produto(Descricao.LEITE, 3.20, 30));

        System.out.println("### ESTOQUE ###");
        for (Produto e : produtos){
            System.out.println(e.toString());
        }

        do {
            System.out.println("### MENU ###");
            System.out.println("1 - Novo Pedido:");
            System.out.println("2 - Realizar Pagamento:");
            System.out.println("0 - Sair");
            menu = inputMenu.nextInt();
            switch (menu){
                case 1:
                    //forma de pagamenteo arbritaria para teste
                    System.out.println("### Realizar Pagamento:");
                    pedidos = new Pedido(TipoPagamento.DINHEIRO, produtos);

                    break;
                case 2:
                    pedidos.realizarPagamento();
                    break;
            }
        }while (menu != 0);
    }
}