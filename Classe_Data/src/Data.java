import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data (int d, int m, int a){

    }

    public void ajustarData(int d, int m, int a){

    }
    public String mostraData(){
        return null;
    }


    private void dataEhValida(int d, int m, int a){
        Integer[] mesGrandeBase = {1,3,5,7,8,10,12};
        Integer[] mesPequenoBase = {4,6,9,11};
        ArrayList<Integer> mesGrande = new ArrayList<Integer>();
        ArrayList<Integer> mesPequeno = new ArrayList<Integer>();
        mesGrande.addAll(Arrays.asList(mesGrandeBase));
        mesPequeno.addAll(Arrays.asList(mesPequenoBase));





    }

}
