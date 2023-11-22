package Class01;
//在arr数组中找到满足<= vlaue的最右位置
public class Code06_BSNearRight {
    public static int nearextIndex(int nums[],int value) {
    	int l = 0;
    	int r = nums.length - 1;
    	while(l < r) {
    		int mid = (l + r + 1) >> 1;
    		if(nums[mid] <= value) l = mid;
    		else r = mid - 1;
    	}
    	return l;
    }
	
	
	public static void main(String []args) {
		int []nums = {0,1,1,1,1,1,3,4,5,6,7};
		System.out.print(nearextIndex(nums,1));
	}
}
