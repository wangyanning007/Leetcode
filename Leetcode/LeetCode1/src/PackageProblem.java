
public class PackageProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int []w={2,2,6,5,4};
		int []v={6,3,5,4,6};
		int c=10;//ÈÝÁ¿
		System.out.println(pp(w, v, c, n));
	}
	
	public static int pp(int w[],int v[],int c,int n){
		int [][] bag=new int[n][c];
		for(int i=0;i<c;i++){
			if(w[0]<=(i+1)){
				bag[0][i]=v[0];
			}else {
				bag[0][i]=0;
			}
			System.out.print(bag[0][i]+" ");
		}
		System.out.println();
		for(int i=1;i<5;i++){
			for(int j=0;j<c;j++){
				if(w[i]<=j){
					bag[i][j]=Math.max(bag[i-1][j-w[i]]+v[i], bag[i-1][j]);
				}else {
					bag[i][j]=bag[i-1][j];
				}
				System.out.print(bag[i][j]+" ");
			}
			System.out.println();
			
		}
		return bag[n-1][c-1];
	}

}
