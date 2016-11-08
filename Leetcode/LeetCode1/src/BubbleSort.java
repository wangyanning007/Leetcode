
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,1,3,4,5,6,7,8,9};
		int i,j,temp;
		boolean flag=true;
		for(i=arr.length-1;i>=0&&flag;i--){
			flag=false;
			for(j=0;j<i;j++){
				temp=arr[j];
				if(temp>arr[j+1]){
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
		}
		System.out.println("i:"+i);
		for (int k : arr) {
			System.out.print(k+" ");
		}
	}

}
