package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr={0,1,2,3,4,5,6,7,8};
		//arr= {1,1,1,1};  //Illegal // assign values allowed olny during initialization
		
		int search = 2;
		
		int length= arr.length;
		int mid = length/2;
		
		boolean ans = binSearch(arr,search,length,mid);
		
		
		
	}

	private static boolean binSearch(int[] arr, int search,int length,int mid) {
		
		
		System.out.println("##"+length);
		System.out.println("##"+mid);
		
		if(arr[mid]==search) {
			System.out.println("Search value is found in the array::: "+mid);
			return true;
			
		}else if(arr[mid]<search) {
			int start = mid;
			mid =(mid+length)/2;
			binSearch(arr,search,length,mid);
		}else if(arr[mid]>search) {
			mid =(mid)/2;
			binSearch(arr,search,length,mid);
		}
		
		return false;
	}

}
