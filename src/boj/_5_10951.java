package boj;

import java.util.Scanner;

public class _5_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextInt()) { // hasNextInt() : 입력을 기다리는 상태. 
								 // 정수 입력이 들어오면 true 리턴하고 다음 nextInt에 넣어즈고,
								 // 정수 이외의 입력이 들어오면 false 리턴
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		}
		
		sc.close();
		

	}

}
