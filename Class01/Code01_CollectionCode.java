package Class01;
//ѡ������
public class Code01_CollectionCode {
	
	public static void main(String[]args) {
		int []arr = {1,3,0,2,9};
		if(arr == null || arr.length < 2) {
			return;
		}
		//0-i��˳��
		for(int i = 0; i < arr.length; i ++ )
		{
			//ѡ�������Ǵ�i + 1��ʼ����С�����±� �ҵ���С�ľͺ�i����
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
