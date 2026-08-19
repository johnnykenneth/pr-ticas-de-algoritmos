public class SomaVetores {
    public static int soma(int[][] mat){
        int resultado=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                resultado+=mat[i][j];
                
            }     
        }
        return resultado;
    }

    public static void main(String[] args) {
        int [] mat1 = {1,4};
        int [] mat2= {2,3};

        int [] [] mat= {mat1, mat2};

        System.out.println(soma(mat));
    }    
}