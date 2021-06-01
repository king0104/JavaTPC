package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9_11022_2 {

	public static void main(String[] args) throws IOException {
		
		// 엔터를 입력할 때 까지 콘솔에서 stream 입력받는 것
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 구분자 1개를 기준으로 문자열 슬라이싱
		StringTokenizer st;
		
		// string + string 하면 새로운 string 생성 -> 새로운 메모리 쓰고, 그래서 느림
		// StringBuilder 사용하면 기존 string 인스턴스에 더해서 string 만듬 -> 빠르고 메모리 누수 적다
		StringBuilder sb = new StringBuilder();
		
		// parseInt : 문자열을 정수(십진수)로 바꿔줌
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n;i++) {
			st = new StringTokenizer(br.readLine()); // 띄어쓰기 기준으로 문자열 분리
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i+1).append(": ").append(a).append(" + ").
			append(b).append(" = ").append(a+b).append("\n");
			
		}
		System.out.println(sb.toString());

	}

}
