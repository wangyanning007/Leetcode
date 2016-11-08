package com.bupt.leetcode121_140;

public class L134 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int diff=0;
		int sum=0;
		int total=0;
		int j=-1;
		for(int i=0;i<gas.length;i++){
			diff=gas[i]-cost[i];
			sum+=diff;
			total+=diff;
			if(sum<0){
				sum=0;
				j=i+1;
			}
		}
		if(total<0) return -1;
		return (j==gas.length)?0:j;
	}

}
