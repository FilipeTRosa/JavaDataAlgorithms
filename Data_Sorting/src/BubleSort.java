public class BubleSort {
    public BubleSort() {
    }

    public BubleSort(int[] vetor) {
        sort(vetor);
    }

    public static Resultado sort(int[] vetor) {
        int trocas = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}
