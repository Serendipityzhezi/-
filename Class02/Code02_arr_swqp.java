package Class02;
import java.util.Arrays;
//���ö������������������������ֵ
public class Code02_arr_swqp {
        
       
        public static void swap(int arr[],int i,int j) {
        	arr[i] = arr[i]^arr[j];
        	arr[j] = arr[i]^arr[j];
        	arr[i] = arr[i]^arr[j];
        	System.out.println(Arrays.toString(arr));
        }
        public static void main(String []args) {
        	int []arr = {0,1,99,1001};
        	System.out.println(Arrays.toString(arr));
        	swap(arr,0,1);
        }
}
