public class SubArrays{

    public static int sub_arrays(int numbers[]){
        for(int i=0 ; i<=numbers.length-1 ; i++){
            for(int j = i+1 ; j <= numbers.length-1 ; j++){
                for(int k =i; k <=j; k++){
                    System.out.print(numbers[k]);
                }
                 System.out.print(" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String [] args){
        int numbers[] ={2,3,4,5,6,7,8};

        sub_arrays(numbers);

    }
}