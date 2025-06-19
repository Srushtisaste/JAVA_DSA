package apnaCollegeNew;

public class LinearSearch {
    public static int find(String[] menu, String key ) {
    	 for(int i =0; i< menu.length; i++) {
    		 if(menu[i]==key) {
    			 return i;
    		 }
    	 }
		return 0;
     }
	public static void main(String[] args) {
		String[] menu = {"Panipuri" , "Bhaji" , "ColdDrink" , "Vadapav" , "Samosa","Bhel"};
		String key = "Vadapav";
		
		int index = find(menu,key);
		
		if(index == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Key found at index " +index);
		}
}

}
