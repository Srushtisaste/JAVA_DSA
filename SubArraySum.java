public class SubArraySum{

    public static void sub_arrays_Sum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<=numbers.length-1 ; i++){
            for(int j = i ; j <= numbers.length-1 ; j++){
                int sum = 0;
                for(int k =i; k <=j; k++){
                    System.out.print(numbers[k]);
                    sum += numbers[k];
                }
                if(sum > maxSum){
                        maxSum = sum;
                }
                 System.out.println(" = " +sum);
            }
            
           System.out.println();
        }
        System.out.println("Max Sum = " + maxSum);
      
    }
    public static void main(String [] args){
        int numbers[] ={2,3,4,5,6,7,8};

        sub_arrays_Sum(numbers);

    }
}