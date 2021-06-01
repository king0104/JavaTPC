package boj;

import java.util.Scanner;

public class _4_10950 {

	public static void main(String[] args) {
		int t;
		
		Scanner sc = new Scanner(System.in);
		
		t=sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		
		for(int i=0; i<t;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int j=0;j<t;j++)
		{
			System.out.println(a[j] + b[j]);
		}
		
		
	}

}
