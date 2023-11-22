package Class01;
//选择排序
public class Code01_CollectionCode {
	
	public static void main(String[]args) {
		int []arr = {1,3,0,2,9};
		if(arr == null || arr.length < 2) {
			return;
		}
		//0-i的顺序
		for(int i = 0; i < arr.length; i ++ )
		{
			//选择排序是从i + 1开始找最小数的下标 找到更小的就和i交换
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j ++ )
			{
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			swap(arr,i,minIndex);
		}
		for(int i = 0; i < arr.length; i ++ )
			System.out.print(arr[i]+" ");
			
	}
	public static void swap(int []arr,int a,int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}
