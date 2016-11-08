
public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,1,5,8,3,7,440,6,2};
		int i,j,temp;
		int increment=arr.length;
		do{
			increment=increment/3+1;//ÔöÁ¿
			for( i=increment;i<arr.length;i++){
				if(arr[i]<arr[i-increment]){
					temp=arr[i];
					for(j=i-increment;j>=0&&temp<arr[j];j-=increment){
						arr[j+increment]=arr[j];
					}
					arr[j+increment]=temp;
				}
			}
		}while(increment>1);
		for (int k : arr) {
			System.out.print(k+" ");
		}

	}

}
