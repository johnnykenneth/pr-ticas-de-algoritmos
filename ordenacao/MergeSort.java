public class MergeSort implements Ordenador {

  @Override
  public int[] ordenar(int[] array) {
    if (array.length <= 1) {
      return array;
    }

    int meio = array.length / 2;
    int[] esquerda = new int[meio];
    int[] direita = new int[array.length - meio];

    System.arraycopy(array, 0, esquerda, 0, meio);
    System.arraycopy(array, meio, direita, 0, array.length - meio);

    esquerda= ordenar(esquerda);
    direita= ordenar(direita);

    return merge(esquerda, direita);
  }

  private int[] merge(int[] esquerda, int[] direita) {
    int[] resultado = new int[esquerda.length + direita.length];

    int i = 0;
    int j = 0;
    int k = 0;

    // Compara os elementos dos dois arrays
    while (i < esquerda.length && j < direita.length) {

        if (esquerda[i] <= direita[j]) {
            resultado[k] = esquerda[i];
            i++;
        } else {
            resultado[k] = direita[j];
            j++;
        }

        k++;
    }

    // Se ainda sobraram elementos na esquerda
    while (i < esquerda.length) {
        resultado[k] = esquerda[i];
        i++;
        k++;
    }

    // Se ainda sobraram elementos na direita
    while (j < direita.length) {
        resultado[k] = direita[j];
        j++;
        k++;
    }

    return resultado;
}
  
  @Override
  public String getNome() {
    return "Merge Sort";
  }
}