package Class02;
//一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数 
public class Code05 {
      public static void main(String[] args) {
    	  int []arr = {0,1,2,2,3,3,4,4};
    	  int err = 0;
    	  for(int i = 0; i < arr.length; i ++ ) {
    		  err ^= arr[i];
    	  }
    	  int ri = err & (-err);
    	  int only = 0;
    	  for(int i = 0; i < arr.length; i ++) {
    		  if((ri & arr[i]) == 0)
    			  only ^= arr[i];
    	  }
    	  System.out.println(only + " " + (err ^ only));
      }
}
