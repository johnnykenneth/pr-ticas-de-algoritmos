public class InsertionSort implements Ordenador {

  @Override
  public int[] ordenar(int[] array) {
    //comeca do segundo elemento, pois o primeiro já é considerado ordenado
    for (int i = 1; i < array.length; i++) {
      int valor = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > valor) {
        //move o elemento para a direita
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = valor;
    }
    return array;
  }

  @Override
  public String getNome() {
    return "Insertion Sort";
  }
  
}
