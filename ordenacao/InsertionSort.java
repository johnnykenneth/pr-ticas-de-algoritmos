public class InsertionSort implements Ordenador {

  @Override
  public int[] ordenar(int[] array) {
    //comeca do segundo elemento, pois o primeiro já é considerado ordenado
    for (int i = 1; i < array.length; i++) {
      int valor = array[i];
      int j = i - 1;

      //volta corrigindo os elementos maiores que o valor para a direita
      while (j >= 0 && array[j] > valor) {

        array[j + 1] = array[j];
        j--;
        //move o elemento para a direita
        //complete o código aqui
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
