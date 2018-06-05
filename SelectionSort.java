//Find the minimum element in the array and put that in that first value. 
//Leave the first value and find the minimum element in the remaining and put in the next place.. so on
//O(n^2)
public class SelectionSort {
	public static void  sorting(int arr[]){
		int n = arr.length;
		//No need to loop for last element..
		for(int i =0; i < n-1; i++){
			int min_idx = i;
			// finding the minimum element
			for(int j = i+1;j<n;j++){
				if(arr[j] < arr[min_idx])
					min_idx = j;
			}
			//Swapping the minimum value to first
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 25, 12, 22, 11};
	    int n = arr.length;
	    sorting(arr);
	    //printing the sorted array
	    for(int i = 0; i < n ; i++)
	    	System.out.println(arr[i]);
	}

}
