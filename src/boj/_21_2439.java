package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		for(int i=n;i>0;i--) {
			
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=i-1;k<n;k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
