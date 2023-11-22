package Class01;
import java.io.*;
public class second {
	//读字符串
	   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//读数字 一般用下面这个
	   static StreamTokenizer in = new StreamTokenizer(br);
	   static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
       public static void main(String args[]) throws Exception{
    	   int a = 0;
    	   int b = 0;
    	   in.nextToken();//每次输入前都要token
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
    	   out.close();//一定要加 不然不输出
       }
}
