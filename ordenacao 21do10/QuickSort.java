public class QuickSort implements Ordenador {
  
  @Override
  public int[] ordenar(int[] array) {
    quickSort(array, 0, array.length - 1);
    return array;
  }

  public void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(vetor, inicio, fim);

            // Ordena os elementos à esquerda do pivô
            quickSort(vetor, inicio, pivo - 1);

            // Ordena os elementos à direita do pivô
            quickSort(vetor, pivo + 1, fim);
        }
    }

  private int particionar(int[] array, int inicio, int fim) {
      int pivo= array[fim];
      int i= inicio -1;
      
      for (int j = inicio; j < fim; j++) {
          if (array[j]<= pivo){
              i++;

              int add= array[i];
              array [i]= array[j];
              array [j]= add;
          }
      }

      int add= array[i+1];
      array[i+1]= array[fim];
      array[fim]= add;

      return i+1;
  }

  @Override
  public String getNome() {
    return "Quick Sort";
  }
}