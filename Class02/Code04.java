package Class02;
//��ô��һ��int���͵�������ȡ�������������Ҳ��1��
public class Code04 {
     public static void main(String[]args) {
    	 int a = 3;
    	 System.out.println(~a + 1);
    	 System.out.println(a & (-a));
    	 //��ȡ�����Ҳ��1  a & (~a + 1) �� a & (-a)
     }
}
