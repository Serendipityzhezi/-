package Class01;
import java.util.Scanner;
public class first {
   public static  int f(int n) {
	   if(n == 1)return 1;
	   else if(n == 2)return 2;
	   else
	   return f(n-1) + f(n-2);
   }
   public static void main(String[]args) {
	   int n;
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	   System.out.println(f(n));
   }

   
}
