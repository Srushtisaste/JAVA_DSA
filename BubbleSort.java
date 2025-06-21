public class BubbleSort{
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int turn =0 ; turn< n-1; turn++){
            for(int j= 0; j< n-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
     public static void printarr(int arr[]){
            for(int i =0 ; i< arr.length-1; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

    public static void main (String [] args){
        int arr[] ={3,4,8,2,9,5,7};
        BubbleSort(arr);
        printarr(arr);
    }
}