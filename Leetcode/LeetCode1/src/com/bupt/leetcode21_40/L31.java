package com.bupt.leetcode21_40;

public class L31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1,2 };
		nextPermutation(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}

	public static void nextPermutation(int[] nums) {
		
		//��һ���������һ������
		int i=nums.length-1;
		while(i>0&&nums[i-1]>=nums[i]){
			i--;
		}
		System.out.println(i);
		if(i==0){
			reverse(nums,0,nums.length-1);
			return;
		}
		//�ڶ��������ֱ�nums[i-1]������һ����
		int j=nums.length-1;
		while(j>0&&nums[i-1]>=nums[j]){
			j--;
		}
		//������������nums[i-1]��nums[j]
		int tmp=nums[i-1];
		nums[i-1]=nums[j];
		nums[j]=tmp;
		
		//���Ĳ�����nums[i-1]��������ֽ��з�ת
		reverse(nums, i, nums.length-1);
		
	}

	private static void reverse(int[] nums, int begin, int end) {
		// TODO Auto-generated method stub
		int l=begin,r=end;
		while(l<r){
			int tmp=nums[l];
			nums[l]=nums[r];
			nums[r]=tmp;
			l++;
			r--;
		}
	}
}
