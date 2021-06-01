package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _18_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// StringTokenizer st = new StringTokenizer(s);
		
		int n = Integer.parseInt(s);
		
		int sum = 0;
		for(int i=1; i<n+1;i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
