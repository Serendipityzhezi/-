package Class01;
//二分查找一个数
public class Code04_BSExit {
	   public static boolean BSExit(int nums[],int num) {
		   int l = 0;
		   int r = nums.length - 1;
		   int mid = 0;
		   while(l < r) {
			 mid = l + ((r - l) >> 1);//>>优先级比+低所以要用括号
		     if(nums[mid] == num)return true;
		     else if(nums[mid] > num) {
		    	 r = mid -1;
		     }
		     else 
		    	 l = mid + 1;
		   }
		   return nums[l] == num;
	   }
       public static void main(String[]args) {
    	   int[]arr = {0,2,3,4,5,6,7,8,100};
    	   System.out.print(BSExit(arr,100));
       }
}
