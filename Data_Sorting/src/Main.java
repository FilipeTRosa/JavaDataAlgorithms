public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i=0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length); //gera um int aleatorio
        }

        for(int i=0; i<vetor.length; i++) {
                System.out.println(vetor[i]);
            }
        }
    }
