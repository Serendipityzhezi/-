package Class02;

import java.util.HashMap;

//һ����������һ��������K�Σ���������������M�Σ�
//��֪M > 1��K < M���ҵ�������K�ε���
//Ҫ�����ռ临�Ӷ�O(1)��ʱ�临�Ӷ�O(N)
public class Code06_KM {
	//��ϣ��ʵ�ַ�ʽ
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
	//�������ʵ�ַ�ʽ
    public static int km(int arr[],int k,int m) {
    	//t�����ʾ��λ���ϵ�1�����˼���
    	int []t = new int[32];
    	for(int num : arr) {
    		for(int i = 0; i < 31; i ++ ) {
    			//�ұ߽���ǵ�ǰλ����1����0
        		t[i] += (num >> i)& 1;
        	}
    	}
    
    	int ans = 0;
    	for(int i = 0; i < 31; i ++ )
    	{
    		//�����ǰλ��������m˵����k�γ��ֵ���
    		if(t[i] % m != 0)
    			//�ͰѴ𰸵�ǰλ����1
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
