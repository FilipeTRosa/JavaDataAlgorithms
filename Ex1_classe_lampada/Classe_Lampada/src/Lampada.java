public class Lampada {

    boolean energizado = false;

    public Lampada() {

    }

    public void energizar() {
        this.energizado = true;
    }
    public void desenergizar() {
        this.energizado = false;
    }
    public boolean mostrarEstado (){
        return this.energizado;
    }
}
