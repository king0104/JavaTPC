package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27_10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		StringBuilder sb = new StringBuilder();

		// 가장 큰 루프 하나 돌 때 한 줄 출력
		for(int i=0;i<n;i++) {
			// 문제를 나눠서 생각하기
			
			// < 문제 나누기>
			// 한 줄에서 공백을 출력하는 부분과 별을 출력하는 부분으로 나누면 되겠구나!!
			
			// <방법>
			// 1. 공백을 전부 출력
			// 2. 별을 전부 출력
			// 	2-1. 출력되는 별 중에서 짝수번째 등장하는 별들은 공백처리
			
			// 1. 공백 출력
			for(int j=0;j<n-1-i;j++) {
				sb.append(" ");
			}
			
			// 2. 별 출력
			for(int k=0;k<(2*i+1);k++) {
				if(k%2 == 0)
					sb.append("*");
				else
					sb.append(" ");
			}
			
			sb.append("\n");
			
		}
		
		
		System.out.println(sb.toString());

	}

}
