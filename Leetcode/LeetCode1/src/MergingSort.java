
public class MergingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]=new int[]{5,2,4,3};
		Msort(A, 0, A.length-1);
		print(A);
		
	}
	public static void Msort(int a[],int low,int high){
//		if(low>=high) return;
		int m=(low+high)/2;
		if(low<high){
			Msort(a,  low, m);
			Msort(a,  m+1, high);
			Merge(a,low,m,high);
			print(a);
		}
		
	}
	private static void Merge(int[] a,  int low, int m, int high) {
		// TODO Auto-generated method stub
		int j=m+1,k=low;
		int temp=low;
		int [] tmp=new int [a.length];
		while(low<=m&&j<=high){
			if(a[low]<=a[j]){
				tmp[k++]=a[low++];
			}else {
				tmp[k++]=a[j++];
			}
		}
		while (low<=m) {
			tmp[k++]=a[low++];
		}
		while (j<=high) {
			tmp[k++]=a[j++];
		}
		while (temp<=high) {
			a[temp]=tmp[temp++];
			
		}
		
	}
	public static void print(int[] a) {  
        for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + "\t");  
        }  
        System.out.println();  
    }  

}
