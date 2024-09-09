import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        int menu;


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
            System.out.println("1 - Novo Pedido:")

        }while (menu != 0);


    }
}