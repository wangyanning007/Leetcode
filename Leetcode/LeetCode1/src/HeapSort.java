
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arr[]={0,5,1,9,3,7,4,8,6,2};
		int len=arr.length-1;
		for(i=len/2;i>0;i--){
			AdjustHeap(arr,i,len);
		}
//		System.out.println(arr[1]);
		for(i=len;i>1;i--){
			swap(arr,1,i);
			AdjustHeap(arr, 1, i-1);
		}
		
		for (int x: arr) {
			System.out.println(x);
		}

	}
	private static void swap(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		start=1;
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	public static void  AdjustHeap(int arr[],int i,int len){//大根堆
		int temp=arr[i];
		for(int j=2*i;j<=len;j*=2){
			if(j<len && arr[j]<arr[j+1])//这个操作之后把较大的值定位到j
				j++;
			if(temp>=arr[j])
				break;
			arr[i]=arr[j];
			i=j;
		}
		arr[i]=temp;
	}

}
