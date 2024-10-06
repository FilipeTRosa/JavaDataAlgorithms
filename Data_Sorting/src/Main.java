public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length); //gera um int aleatorio
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //testando o SS
        SelectionSort ss = new SelectionSort();
        ss.ordenaSelectionSort(vetor);
        System.out.println("Vetor Ordenado SS:");
        for(int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //testendo BS
        BubleSort bs = new BubleSort();
        bs.ordenaBubbleSort(vetor);
        System.out.println("Vetor Ordenado BS:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
