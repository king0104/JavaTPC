package boj;


import java.util.Scanner;

public class _13_11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			// String은 배열이 아니다 -> str[i]로 각 원소 접근 불가능. str.charAt(i)로 각 원소 접근 가능
			// println : 문자열 출력이기때문에 한번 출력시마다 엔터 들어감
			// print : 그냥 그대로 출력. 엔터 안들어감.
			if(i%10 == 9)
			{
				System.out.println();
			}	
		}	
	}
}
