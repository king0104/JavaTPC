package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _19_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s2);
		
		int n1 = Integer.parseInt(s1);
		
		int[] n2 = new int[n1];
		int min = 0;
		int max = 0;
		
		for(int i=0; i<n1;i++) {
			n2[i] = Integer.parseInt(st.nextToken());
			if(max==0) max = n2[i];
			if(min==0) min = n2[i];
			
			if(n2[i] > max) {
				max = n2[i];
			}
			if(n2[i]<min) {
				min = n2[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
