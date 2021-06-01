package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25_2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<n;i++) {
			
			
			// 2. 공백 출력
			for(int k=i+1;k<n;k++) {
				//System.out.print(" ");
				sb.append(" ");
			}
			
			// 1. 별 출력
			for(int j=0;j<i+1;j++) {
				//System.out.print("*");
				sb.append("*");
			}
			sb.append("\n");
		
			
		}
		
		for(int q=0;q<n-1;q++) {
			
			
			// 2. 공백 출력
			for(int e=0;e<q+1;e++) {
				//System.out.print(" ");
				sb.append(" ");
			}
			
			// 1. 별 출력
			for(int w=q;w<n-1;w++) {
				//System.out.print("*");
				sb.append("*");
			}
			
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}

}
