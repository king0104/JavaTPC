package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24_2445_2 { //stirngbuilder 사용한 방법

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		
		for(int i=0;i<n;i++) {
			
			// 1. 별 출력
			for(int j=0;j<i+1;j++) sb.append("*");
			
			// 2. 공백 출력
			for(int k=i+1;k<n;k++) sb.append(" ");
			
			// 2. 공백 출력
			for(int k=i+1;k<n;k++) sb.append(" ");
			
			// 1. 별 출력
			for(int j=0;j<i+1;j++) sb.append("*");
			
			sb.append("\n");
		}
		
		for(int q=0;q<n-1;q++) {
			// 1. 별 출력
			for(int w=q;w<n-1;w++) sb.append("*");
			
			// 2. 공백 출력
			for(int e=0;e<q+1;e++) sb.append(" ");
			
			// 2. 공백 출력
			for(int e=0;e<q+1;e++) sb.append(" ");
			
			// 1. 별 출력
			for(int w=q;w<n-1;w++) sb.append("*");
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
