package Class02;
//一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数 
public class Code03 {
	public static void main(String[]args) {
		int arr[] = {0,0,1,1,2,2,2,2,5,5,99675};
		int err = 0;
		//挨个异或 偶数的就是0 剩下的就是奇数个的
		for(int i = 0; i < arr.length; i ++ ) {
			err ^= arr[i];
		}
		System.out.println(err);
		//
	}

}
