public class staircaseSearch{

    public static boolean search_1(int matrix [][],int key){
        //top right approach...
        int row=0;
        int col=matrix[0].length-1;
            while(row< matrix.length && col>=0){
                if(matrix[row][col]==key){
                    System.out.print("Key fount at (" +row +" , " +col +")");
                    System.out.println();
                    return true;
                }
                else if(key < matrix[row][col]){
                    col--;
                }
                else{
                    row++;
                }
            }
            System.out.print("Key doesn't exist");
            return false;
           
    }


         public static boolean search_2(int matrix[][],int key){
             //bottom left approach
            int col = 0 , row = matrix.length-1;

            while(col < matrix[0].length && row >=0){
                if(matrix[row][col]==key){
                    System.out.print("Key fount at (" +row +" , " +col +")");
                    return true;
                }
                else if(key <matrix[row][col]){
                    row--;
                }
                else{
                    col++;
                }

            }
            System.out.println("Key deson't exist...");
            return false;
         }
           
    public static void main(String []args){
         int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
         int key =30; 

         search_1(matrix,key);
         search_2(matrix,key);
    }
}