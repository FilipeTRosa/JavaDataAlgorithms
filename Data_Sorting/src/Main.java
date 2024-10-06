public class Main {
    public static void main(String[] args) {
        int tamanho = 10000;
        int[] vetor = new int[tamanho];

        //preenchendo um vetor com valores aleatorios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length); //gera um int aleatorio
        }
        long inicio, fim; //variaveis para pegar os valores de inicio e fim do algoritimo.
        Resultado resultado;

        //System.out.println("Vetor desordenado");
        //for (int i = 0; i < vetor.length; i++) {
        //    System.out.print("[" + vetor[i] + "]");
        //}System.out.println("\n");

        //Bouble Sort
        System.out.println("\n\nBouble Sort");
        inicio = System.currentTimeMillis(); //pega o tempo em milissegundos
        resultado = BubleSort.sort(vetor.clone());
        fim = System.currentTimeMillis();//novamente pega o tempo em milissegundos
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());

        
        //Insertion sort
        System.out.println("\n\nInsertion Sort");
        inicio = System.currentTimeMillis(); //pega o tempo em milissegundos
        resultado = InsertionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();//novamente pega o tempo em milissegundos
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());

        //Selection sort
        System.out.println("\n\nSelection Sort");
        inicio = System.currentTimeMillis(); //pega o tempo em milissegundos
        resultado = SelectionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();//novamente pega o tempo em milissegundos
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());

        //Heap sort
        System.out.println("\n\nHeap Sort");
        inicio = System.currentTimeMillis(); //pega o tempo em milissegundos
        resultado = HeapSort.sort(vetor.clone());
        fim = System.currentTimeMillis();//novamente pega o tempo em milissegundos
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());

        //quick sort
        System.out.println("\n\nQuick Sort");
        inicio = System.currentTimeMillis(); //pega o tempo em milissegundos
        resultado = QuickSort.sort(vetor.clone(), 0 , vetor.length);
        fim = System.currentTimeMillis();//novamente pega o tempo em milissegundos
        System.out.println("Tempo: " + (fim - inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());


    }
}
