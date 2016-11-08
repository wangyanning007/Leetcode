
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={5,1,9,7,4,8,6,2};
		Qsort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static void Qsort(int arr[],int low,int high){
		int pivot;
		if(low<high){
			pivot=Partition(arr,low,high);
			Qsort(arr, low,pivot-1);
			Qsort(arr, pivot+1,high);
		}
	}
	private static int Partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivotkey=arr[low];
		while(low<high){
			while(low<high&&arr[high]>=pivotkey)
				high--;
			swap(arr,low,high);
			while(low<high&&arr[low]<=pivotkey)
				low++;
			swap(arr,low,high);
		}
		return low;
	}
	private static void swap(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
	}
}
