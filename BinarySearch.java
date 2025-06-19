package apnaCollegeNew;

public class BinarySearch {
		public static int BinarySearch(int num[] , int key) {
			
			int start = 0 ,end = num.length-1;
			
			while(start <= end) {
				
				int mid = (start + end)/2;
				
				if(num[mid] == key) {
					return mid;
				}
				if(num[mid] <= key) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return -1;	
		}
		
	public static void main(String[] args) {
		int num [] = {1,4,6,9,23,45,56,67,78,89};
		int key = 67;
		
		System.out.println("The key is at index : " +BinarySearch(num ,key));
	}

}
