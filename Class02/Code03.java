package Class02;
//һ����������һ���������������Σ���������������ż���Σ���ô�ҵ�����ӡ������ 
public class Code03 {
	public static void main(String[]args) {
		int arr[] = {0,0,1,1,2,2,2,2,5,5,99675};
		int err = 0;
		//������� ż���ľ���0 ʣ�µľ�����������
		for(int i = 0; i < arr.length; i ++ ) {
			err ^= arr[i];
		}
		System.out.println(err);
		//
	}

}
