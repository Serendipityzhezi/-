package Class02;
//怎么把一个int类型的数，提取出二进制中最右侧的1来
public class Code04 {
     public static void main(String[]args) {
    	 int a = 3;
    	 System.out.println(~a + 1);
    	 System.out.println(a & (-a));
    	 //提取出最右侧的1  a & (~a + 1) 即 a & (-a)
     }
}
