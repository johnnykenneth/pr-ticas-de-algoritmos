public class MedidorTempo {

    public static void metodoExemplo() {
        // Simulando uma operação demorada
        for (long i = 0; i < 1_000_000_000L; i++) {
            Math.sqrt(i);
        }
    }

    public static int mult(int a, int b){
        return a*b;

    }

    public static int mult2(int a, int b){
        int resultado= a;
        for(int i = 0; i < b; i++){
            resultado+=a;
        }
        return resultado;
    }

    public static void main(String[] args) {

        mult(2, 2);

        long inicio = System.nanoTime();

        long fim = System.nanoTime();

        long tempo = fim - inicio;

        System.out.println("Tempo de execução: " + tempo + " ns");
        System.out.println("Tempo de execução: " + (tempo / 1_000_000.0) + " ms");

    }
}