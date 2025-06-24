public class transposeMatrix{
    public static void main (String[] args){
        int matrix[][] = {{1,2,3},{4,5,6}};
         int row =2,col=3;

         printMatrix(matrix);

          int transpose[][] = new int [col][row];
         for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
       
    }
     public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
        }
          
     }      
}
