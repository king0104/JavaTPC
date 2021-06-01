package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_2739_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=9;i++)
		{
			sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
		}
		System.out.println(sb);
		

	}

}
