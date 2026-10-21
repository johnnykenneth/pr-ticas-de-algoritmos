package uso_ordenacao;
import java.util.Random;

public class ListaAlunos {
  Aluno[] alunos;

  public ListaAlunos() {
    alunos = new Aluno[100];
    Random random = new Random();
    random.setSeed(System.currentTimeMillis());
    for (int i = 0; i < alunos.length; i++) {
      int idade = random.nextInt(18, 35);
      int matricula = random.nextInt(0, 2000);
      alunos[i] = new Aluno("Aluno " + (i + 1), idade, matricula);
    }
  }
  public void ordernar(Aluno[]alunos, int inicio, int fim){
    quickSort(alunos, 0, alunos.length-1);
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
    Aluno pivo= array[fim];
    int i= inicio -1;
    
    for (int j = inicio; j < fim; j++) {
      if (alunos[j].getIdade()>pivo.getIdade()|| (alunos[j].getIdade()== pivo.getIdade() && alunos[j].getMatricula()> pivo.getMatricula())){
        i++;

        Aluno add= array[i];
        alunos [i]= array[j];
        alunos [j]= add;
      }
    }

    Aluno add= array[i+1];
    alunos[i+1]= array[fim];
    alunos[fim]= add;

    return i+1;
  }

  public static void main(String[]args){
    ordenaIdadeMatricula();
    QuickSort quickSort= new QuickSort();
    quickSort.ordenar(alunos);
  }
}
