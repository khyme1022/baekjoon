package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[5][15];
		String str;
		for(int i=0;i<5;i++) {
			str = br.readLine();
			for(int j=0;j<str.length();j++)
				arr[i][j] = str.charAt(j);
		}
		
		for(int j=0;j<15;j++) {
			for(int i=0;i<5;i++) {
				if(arr[i][j]!='\0') {
					sb.append(arr[i][j]);
				}
			}
		}
		System.out.println(sb);
	}

}
// 0507 해결

