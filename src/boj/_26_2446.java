package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26_2446 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		
		for(int i=0;i<n;i++) {
			
			// 1. 공백 출력
			for(int j=0;j<i;j++) sb.append(" ");
			
			// 2. 별 출력
			for(int k=i;k<n;k++) sb.append("*");
			
			// 2. 별 출력
			for(int k=i;k<n-1;k++) sb.append("*");
			
			
			sb.append("\n");
		}
		
		for(int q=0;q<n-1;q++) {
			// 1. 공백 출력
			for(int w=q;w<n-2;w++) sb.append(" ");
			
			// 2. 별 출력
			for(int e=0;e<q+2;e++) sb.append("*");
			
			// 2. 별 출력
			for(int e=0;e<q+1;e++) sb.append("*");
			
			
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}


}
