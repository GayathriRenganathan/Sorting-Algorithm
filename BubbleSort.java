//swapping the adjacent values until the array is completely sorted
//worst case complexity O(n*n)
//best case complexity O(n)
public class BubbleSort {
	public static void sorting(int arr[]){
		int n = arr.length;
			boolean swapped = false;
			for(int i = 0; i < n-1; i++){
				//Leaving last i elements that are in place ..
				for(int j = 0; j < n-i-1; j++){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swapped = true;
					}
				}
				if(swapped == false)
					return;
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
