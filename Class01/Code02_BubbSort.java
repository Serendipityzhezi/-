package Class01;
import java.util.*;
public class Code02_BubbSort {
	public static void BubbSort(int[]arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		//0-n-1
		//0-n-2
		//0-n-3
		//0-1
		for(int e = arr.length - 1; e > 0; e --) {
			for(int i = 0; i < e; i ++ ) {
				//ϣ�����Ԫ������ƶ��������
				if(arr[i] > arr[i + 1])
					swap(arr,i,i + 1);
			}
		}
	}

	public static void swap(int []arr,int a,int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//fortext
	//����������� ���ֵ������
	public static int[] generateRandomArray(int maxSize,int maxValue) {
		int []arr = new int[(int)(Math.random() * (maxSize + 1))];
		for(int i = 0; i < arr.length; i ++ ) {
			arr[i] = (int)(Math.random() * (maxValue + 1)) -(int)(Math.random() * maxValue);
		}
		return arr;
		
	}
	
	//�ǲ���һ��
	public static boolean isEqual(int []arr1,int[]arr2) {
		if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null))return false;
		if(arr1 == null && arr2 == null)
			return true;
		if(arr1.length != arr2.length)
			return false;
		for(int i = 0; i < arr1.length; i ++ )
		{
			if(arr1[i] != arr2[i])return false;
		}
		return true;
	}
	//����
	public static int[] copyArray(int []arr1) {
		if(arr1 == null)return null;
		int []arr = new int [arr1.length];
		for(int i = 0; i < arr1.length; i ++ ) {
			arr[i] = arr1[i];
		}
		return arr;
	}
	
	//��ӡ
	public static void printArray(int []arr) {
		if(arr == null)return;
		for(int i = 0; i < arr.length; i ++ )
		System.out.print(arr[i] + " ");
		System.out.println();
	}
	//�ԱȺ���
	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[]args) {
		int testTime = 500000;
		int maxSize = 5; // �������ĳ���0��100
		int maxValue = 100;// ֵ��-100��100
		boolean succeed = true;
		for(int i = 0; i < testTime; i ++ ) {
			int[] arr = generateRandomArray(maxSize, maxValue);
			int[] arr1 = copyArray(arr);
			int[] arr2 = copyArray(arr);
			BubbSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				// ��ӡarr1
				// ��ӡarr2
				succeed = false;
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);
//		int []arr = {1,5,3,4,6};
		printArray(arr);
		BubbSort(arr);
		printArray(arr);
		}
	}
