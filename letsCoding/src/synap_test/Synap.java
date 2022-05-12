package synap_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Synap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char arr[] = new char[27];
		List<Integer> column = new ArrayList<>();
		for(int i=1;i<arr.length;i++) {
			arr[i] = (char)(65+i-1);
		}
		while (true) {
			int r = n%26; // 나머지
			n = n/26; // 몫
			
			if(r==0) {
				n -= 1;
				column.add(26);
			}
			else {
				column.add(r);
			}
			
			if(n<=26) {column.add(n); 
			break;
			}
		}
		Collections.reverse(column);
		for(int tmp : column) {
			System.out.print(arr[tmp]);
		}
		
	}

}
//26*25+26
