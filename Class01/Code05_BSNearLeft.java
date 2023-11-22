package Class01;
import java.util.Arrays;
//在arr数组中找>=value的最左边位置
public class Code05_BSNearLeft {
    
	 //寻找起始位置
	public static int nearnestIndex(int []nums,int value) {
		int l = 0;
		int r = nums.length - 1;
		while(l < r) {
			int mid = l + ((r - l) >> 1);
			if(nums[mid] >= value) r = mid;
			else l = mid + 1;
		}
		return l;
	}
	
	public static void main(String []args) {
		int []nums = {0,1,1,2,2,3,4,5,6,7};
		System.out.print(nearnestIndex(nums,2));
	}
}
