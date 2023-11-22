package Class01;
//递归实现指数型枚举
import java.util.*;
import java.io.*;
public class third {
	static int n;
	static int state[];
	public static void dfs(int u) {
		if(u > n) {
			for(int i = 1; i <= n; i ++ ) {
				if(state[i] == 1)
					System.out.print(i+" ");
			}
			System.out.println();
            return;
			
		}
		
		state[u] = 1;
		dfs(u + 1);
		state[u] = 0;
		
		state[u] = 2;
		dfs(u + 1);
		state[u] = 0;
	}
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
        state = new int[n + 1];
    	dfs(1);
    }
}
