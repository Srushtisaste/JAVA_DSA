public class OddEven{

    public static void OddEven(int n){
        int bitmask =1;

        if((n & bitmask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd Number");
        }
    }
    public static void main(String []arg){
        OddEven(3);
        OddEven(30);
        OddEven(4);
    }
}