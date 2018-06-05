
public class QuickSort {

	public int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j <= high-1 ; j++){
			if(arr[j] <= pivot){
				i++;
				//swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//swap arr[i+1] and arr[high]
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	 public void sort(int arr[], int low, int high){
		 if(low < high){

			 int partition = partition(arr,low,high);
			 sort(arr,low, partition-1);
			 sort(arr,partition+1, high);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort qs = new QuickSort();
//		int arr[] = {64, 25, 12, 22, 11};
		int arr[] = {80,10,30,90,40,50,70};
		qs.sort(arr,0,arr.length-1);
	    //printing the sorted array
		int n = arr.length;
	    for(int i = 0; i < n ; i++)
	    	System.out.println(arr[i]);
	}

}
