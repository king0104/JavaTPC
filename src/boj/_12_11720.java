package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _12_11720 {

	public static void main(String[] args) {
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc=new Scanner(System.in);
		
		int t = sc.nextInt();
		String str = sc.next(); // next : 공백 기준으로 한단어 또는 한문장 입력받기
								// nextLine() : 문자 또는 한 문장 전체를 입력받는다
		
		
		int sum = 0;
		for(int i=0;i<t;i++)
		{
			sum += str.charAt(i) - '0'; // charAt() : 해당 인덱스에 있는 값을 "아스키코드 값"으로 반환
			// char의 아스키 코드 = 순서 넘버링 + 48
			// 따라서 char을 int(순서)로 바꾸고 싶으면 아스키코드 값에서 -48 해주어야 한다!!
		}
		System.out.println(sum);
		sc.close();
	}

}
