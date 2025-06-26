public class compress{

    public static String compressString(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count = 1;
        for(int i =0; i<str.length();i++){
            while(i <str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1){
              sb.append(count);
            }
            count =1;
        }
        return sb.toString();
    }
    public static void main(String [] args){
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
    }
}

// public class compress {

//     public static String compressString(String str) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;

//         for (int i = 0; i < str.length(); i++) {
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if (count > 1) {
//                 sb.append(count);
//             }
//             count = 1; // reset for next character
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String str = "aaabbcccdd";
//         System.out.println(compressString(str));  // Output: a3b2c3d2
//     }
// }
