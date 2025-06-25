public class subString{

    public static String substring(String str, int si, int ei){
        String subString = "";
        for(int i =si; i<ei; i++){
            subString += str.charAt(i);
        }

        //using in built function...
        subString = str.substring(0,5);
        System.out.println(subString);
        return subString;
    }


    public static void main(String []args){
        String str = "HelloWorld";
    System.out.print(substring(str,0,5));
    }
}