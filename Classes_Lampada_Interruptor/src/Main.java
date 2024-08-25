//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Interruptor interruptor = new Interruptor(lampada);

        interruptor.abrirCircuito();
        System.out.println(lampada.mostrarEstado());
        interruptor.fecharCircuito();
        System.out.println(lampada.mostrarEstado());
    }
}