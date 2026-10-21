
public class App {
    public static void main(String[] args) throws Exception {
        //cria um array de valores aleatoresio interios
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        System.out.println("--------------------------------------------------");
        Ordenador selectionSort = new SelectionSort();
        ordeneConte(array.clone(), selectionSort);
        System.out.println("--------------------------------------------------");
        Ordenador insertionSort = new InsertionSort();
        ordeneConte(array.clone(), insertionSort);
        System.out.println("--------------------------------------------------");
        Ordenador quickSort = new QuickSort();
        ordeneConte(array.clone(), quickSort);
        System.out.println("--------------------------------------------------");
        Ordenador mergeSort = new MergeSort();
        ordeneConte(array.clone(), mergeSort);
        System.out.println("--------------------------------------------------");
    }

    private static void ordeneConte(int[] array, Ordenador sorter) {
        long inicio = System.currentTimeMillis();
        int[] sortedSelection = sorter.ordenar(array);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        boolean isSorted = verifySorted(sortedSelection);
        System.out.println("Algoritmo: " + sorter.getNome());
        System.out.println("Array ordenado: " + isSorted);
        System.out.println("Tempo gasto: " + tempo + " ms");
    }

    private static boolean verifySorted(int[] sortedSelection) {
        for (int i = 0; i < sortedSelection.length - 1; i++) {
            if (sortedSelection[i] > sortedSelection[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
