package Class02;

import java.util.HashMap;

//一个数组中有一种数出现K次，其他数都出现了M次，
//已知M > 1，K < M，找到出现了K次的数
//要求额外空间复杂度O(1)，时间复杂度O(N)
public class Code06_KM {
	//哈希表实现方式
    public static int hash(int arr[],int k,int m) {
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int num:arr) {
    		if(map.containsKey(num))
    			map.put(num, map.get(num) + 1);
    		else map.put(num, 1);
    	}
    	
    	
    	int ans = 0;
    	for(int num:map.keySet()) {
    		if(map.get(num) == k) {
    			ans = num;
    			break;
    		}
    	}
    	return ans;
    }
	//异或运算实现方式
    public static int km(int arr[],int k,int m) {
    	//t数组表示该位置上的1出现了几个
    	int []t = new int[32];
    	for(int num : arr) {
    		for(int i = 0; i < 31; i ++ ) {
    			//右边结果是当前位上是1还是0
        		t[i] += (num >> i)& 1;
        	}
    	}
    
    	int ans = 0;
    	for(int i = 0; i < 31; i ++ )
    	{
    		//如果当前位不能整除m说明有k次出现的数
    		if(t[i] % m != 0)
    			//就把答案当前位或上1
    			ans |= (1 << i);
    	}
    	return ans;
    }
    
	public static void main(String[]args) {
		int []arr = {0,0,1,1,9,9,3,3,4};
		System.out.println(hash(arr,1,2));
		System.out.println(km(arr,1,2));
	}
}
