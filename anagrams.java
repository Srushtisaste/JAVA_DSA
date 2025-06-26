import java.util.*;
public class anagrams{
    public static void main(String [] args ){
        String str1 = "heart";
        String str2 = "arth";

       str1 =  str1.toLowerCase();
       str2 = str2.toLowerCase();

       if(str1.length() == str2.length()){
         char [] ch1 = str1.toCharArray();
        char [] ch2  = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result =Arrays.equals(ch1,ch2);
        if(result){
            System.out.println("String are anagrams");

        }
        else {
             System.out.println("String are not anagrams");
        }
       }
       else{
         System.out.println("String length are enqual");
       }
        
       }
}
