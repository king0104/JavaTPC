package boj;

import java.util.Scanner;

public class _7_10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] sum=new int[t]; // 합을 저장해둘 배열 생성
		
		for(int i=0;i<t;i++) 
		{ 
			String str = sc.next(); // 입력받을 문자열
			String[] arr = str.split(",");// 문자열을 ,(컴마) 기준으로 배열로 나누기
			
			int num1=Integer.parseInt(arr[0]);
			int num2=Integer.parseInt(arr[1]);
			sum[i] = num1 + num2;
		}
		
		for(int i=0;i<t;i++) 
		{
			System.out.println(sum[i]);
		}
		
		
		sc.close();
	}

}
