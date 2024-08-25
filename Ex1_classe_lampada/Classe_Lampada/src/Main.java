
public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada ();

        lampada.energizar();
        if (lampada.mostrarEstado()){
            System.out.println("Energizada");
        }else {
            System.out.println("Desenergizada");
        }
        lampada.desenergizar();

        if (lampada.mostrarEstado()){
            System.out.println("Energizada");
        }else {
            System.out.println("Desenergizada");
        }
    }
}