//insert the element based on the value
//complexity -- O(n*n)
public class InsertionSort {
	public static void sorting(int arr[]){
		int n = arr.length;
		for(int i = 1; i < n ; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
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
