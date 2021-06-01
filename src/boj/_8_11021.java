package boj;

import java.util.Scanner;

public class _8_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int[] sum = new int[t];
		
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			sum[i] = a + b;
		}
		
		for(int j=0;j<t;j++)
		{
			System.out.println("Case #" + (j+1) + ": " + sum[j] );
		}
		
		sc.close();	
		
	}

}
