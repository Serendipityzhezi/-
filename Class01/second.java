package Class01;
import java.io.*;
public class second {
	//���ַ���
	   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//������ һ�����������
	   static StreamTokenizer in = new StreamTokenizer(br);
	   static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
       public static void main(String args[]) throws Exception{
    	   int a = 0;
    	   int b = 0;
    	   in.nextToken();//ÿ������ǰ��Ҫtoken
    	   a = (int)in.nval;
    	   in.nextToken();
    	   b = (int)in.nval;
    	   out.println(a + b);
    	   in.nextToken();
    	   String a1 = in.sval;
    	   in.nextToken();
    	   String b1 = in.sval;
    	   out.println(a1 + b1);
    	   String s = br.readLine();
    	   out.println(s);
    	   out.close();//һ��Ҫ�� ��Ȼ�����
       }
}
