package Class02;
//һ���������������������������Σ���������������ż���Σ���ô�ҵ�����ӡ�������� 
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
