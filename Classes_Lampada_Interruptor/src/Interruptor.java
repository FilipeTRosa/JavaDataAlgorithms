public class Interruptor {
    private Lampada lampada;

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    public void fecharCircuito(){
        this.lampada.desenergizar();
    }
    public void abrirCircuito(){
        this.lampada.energizar();
    }
}
