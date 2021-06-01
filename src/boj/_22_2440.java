package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _22_2440 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		for(int i=n;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
