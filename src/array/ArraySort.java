package array;

public class ArraySort {
	
	public static void main(String[] args) {
		int arr[] = {23,11,24,56,1};
		int var =0;
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i]>arr[j]) {
					var = arr[i];
					arr[i] = arr[j];
					arr[j] = var;
				}		
			}	
		}
		
		for(int p:arr) {
			System.out.println(p);
		}
	}

}
