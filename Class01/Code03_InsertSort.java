package Class01;

public class Code03_InsertSort {
	public static void main(String[]args) {
		int []arr = {1,3,0,2,9};
		if(arr == null || arr.length < 2) {
			return;
		}
		//i����0-i������
		//0-1
		//0-2
		//0-n-1
		//ʱ�临�Ӷ��n^2
		for(int i = 0; i < arr.length; i ++ ){
			//jΪiǰһ�� ���ǰһ�����򽻻� ʱ�临�ӶȲ�ȷ��
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
