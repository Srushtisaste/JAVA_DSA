public class SubArraySum{

    public static void sub_arrays_Sum(int numbers[]){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculating prefix

        for(int i = 1 ; i<= prefix.length-1; i++){
            
            prefix[0] = numbers[0];

            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0 ; i<=numbers.length-1 ; i++){
            int start = i;
            for(int j = i ; j <= numbers.length-1 ; j++){
                int end = j;
                
                sum = start ==0 ? prefix[end] : prefix[end] + prefix[start-1];

                if(sum > maxSum){
                        maxSum = sum;
                }
                 System.out.print(sum + " ");
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