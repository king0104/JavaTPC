package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23_2441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		for(int i=n;i>0;i--) {
			
			// 1. 공백 출력
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			// 2. 별 출력
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println( );
			
		}
	}

}
