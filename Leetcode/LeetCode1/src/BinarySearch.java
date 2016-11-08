
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={1,2};
		int target=0;
		int l=0;
		int r=nums.length-1;
		int mid;
		while(l<=r){
			mid=(r+l)/2;
			if(target==nums[mid]) {
				System.out.println(mid);
				break;
			}
			if(nums[mid]<target){
				l=mid+1;
			}else {
				r=mid;
			}
		}
	}

}
