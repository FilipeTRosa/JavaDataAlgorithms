public class SelectionSort {


    public SelectionSort() {
    }

    public int[] ordenaSelectionSort(int[] vetor) {
        int posicaoMenor, aux;
        for (int i = 0; i < vetor.length; i++) {
            posicaoMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }
        return vetor;
    }
}