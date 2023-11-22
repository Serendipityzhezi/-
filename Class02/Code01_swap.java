package Class02;
//不用额外变量交换两个数的值
public class Code01_swap {
       public static void swap(int a,int b) {
           a = a ^ b;
           b = a ^ b;
           a = a ^ b;
    	   System.out.println(a + " " + b);
       }
       public static void main(String[]args) {
    	   int a = 1;
    	   int b = 2;
    	   System.out.println(a + " " + b);
    	   swap(a,b);
       }
}
