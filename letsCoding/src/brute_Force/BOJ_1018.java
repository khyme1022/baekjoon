package brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
	public static char[][] chess;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				chess[i][j] = str.charAt(j);
			}
		}
		
		int start_N = N-8;
		int start_M = M-8;
		int cnt = 0;
		for(int i=0;i<start_N;i++) {
			for(int j=0; j<start_M;j++) {
				cnt = count(i,j);
			}
		}
		
		System.out.println(cnt);
		
	}
	
	public static int count(int n, int m) {
		/*char color = chess[n][m];
		for(int i=n;i<n+8;i++) {
			for(int j=m;j<m+8;j++) {
				if(arr[i][j]) 
			}
		}*/
		return 0;
	}
	public static char change(char n) {
		if(n=='B') n='W';
		else n='B';
		return n;
	}

}
