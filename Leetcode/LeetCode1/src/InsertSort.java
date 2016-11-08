
public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,1,5,8,3,7,4,6,2};
		int i,j,k;
		for(i=0;i<arr.length;i++){
			k=arr[i];
			for(j=i-1;j>=0&&k<arr[j];j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=k;
		}
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
}
