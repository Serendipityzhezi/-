package Class01;

public class Code03_InsertSort {
	public static void main(String[]args) {
		int []arr = {1,3,0,2,9};
		if(arr == null || arr.length < 2) {
			return;
		}
		//i控制0-i的排序
		//0-1
		//0-2
		//0-n-1
		//时间复杂度最坏n^2
		for(int i = 0; i < arr.length; i ++ ){
			//j为i前一个 如果前一个大则交换 时间复杂度不确定
			for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j --)
				swap(arr, j ,j + 1);
		}
		for(int i = 0; i < arr.length; i ++ )
		System.out.print(arr[i] + " ");
	}

	public static void swap(int []arr,int a,int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
