package Class01;
//Ѱ�Ҿֲ���Сֵ
public class Code07_BSAwsome {
	//���ؾֲ���Сֵ������
	  public static int getLessIndex(int nums[]) {
		  if(nums == null || nums.length == 0 )
			  return -1;
		  //��һ���ֲ���С
		  if(nums.length == 1 || nums[0] < nums[1])
			  return 0;
		  //���һ�����ֲ���С
		  if(nums[nums.length - 1] < nums[nums.length - 2])
			  return nums.length - 1;
		  //�м����ֲ���С
		  int l = 0;
		  int r = nums.length - 1;
		  int mid = 0;
		  while(l < r) {
			  mid = l + ((r - l) >> 1);
			  if(nums[mid] > nums[mid - 1])
				  r = mid - 1;
			  else if(nums[mid] > nums[mid + 1])
				  l = mid + 1;
			  else
				  return mid;
		  }
		  return l;
	  }
      public static void main(String []args) {
    	  int []arr = {9,8,7,6,5,3,10};
    	  System.out.print(getLessIndex(arr));
      }
}
