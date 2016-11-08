
public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,1,5,8,3,7,4,6,2};
		int i,j,k,tmp;
		for(i=0;i<arr.length;i++){
			k=i;
			for(j=i+1;j<arr.length;j++){
				if(arr[k]>arr[j])
					k=j;
			}
			tmp=arr[i];
			arr[i]=arr[k];
			arr[k]=tmp;
		}
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
