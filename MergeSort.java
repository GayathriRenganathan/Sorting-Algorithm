/*
 * Time Complexity - O(n Log n)
 * Auxillary Space - O(n)
 */
public class MergeSort {
	// First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
	public void merge(int arr[], int low, int m , int high){
		
		//Find the size of two sub-array
		int n1 = m -low +1;
		int n2 = high-m;
		
		//create two array this size
		int L[]  = new int[n1];
		int R[]  = new int[n2];
		
		//copy data to two arry
		for(int i = 0; i <n1 ; i++)
			L[i] = arr[low +i];
		for(int j = 0; j<n2; j++)
			R[j] = arr[m+1+j];
		
		//Merge two arrays
		int i = 0; int j =0;
		//initial index of merged array
		int k = low;
		while ( i < n1 && j< n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] =  R[j];
			j++;
			k++;
		}
	}
	public void sort(int arr[], int low, int high){
		if(low < high){
			int m = (low +high)/2;
			sort(arr,low,m);
			sort(arr,m+1,high);
			
			merge(arr,low,m,high);
		}
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n ; i++)
	    	System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
	}

}
