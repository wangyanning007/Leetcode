package com.bupt.leetcode61_80;

public class L73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {

		int m=matrix.length;
		int n=matrix[0].length;
		int i,j;
		//�жϵ�һ�е�һ����û��0���еĻ���һ�±��
		boolean firstRow=false,firstCol=false;
		for(j=0;j<n;j++){
			if(matrix[0][j]==0){
				firstRow=true;
				break;
			}
		}
		for(i=0;i<m;i++){
			if(matrix[i][0]==0){
				firstCol=true;
				break;
			}
		}
		//�õ�һ�е�һ�м�¼��
		for(i=1;i<m;i++){
			for(j=1;j<n;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		
		for(i=1;i<m;i++){
			if(matrix[i][0]==0){
				for(j=1;j<n;j++){
					matrix[i][j]=0;
				}
			}
		}
		for(j=1;j<n;j++){
			if(matrix[0][j]==0){
				for(i=1;i<m;i++){
					matrix[i][j]=0;
				}
			}
		}
		
		if(firstRow){
			for(j=0;j<n;j++){
				matrix[0][j]=0;
			}
		}
		if(firstCol){
			for(i=0;i<m;i++){
				matrix[i][0]=0;
			}
		}
	}
}
