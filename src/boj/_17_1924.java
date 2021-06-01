package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] dayOfTheWeeks = {"SUN", "MON", "TUE", "WED","THU","FRI","SAT"};
		
		int totalDays = day;
		for(int i=0; i<month-1;i++) {
			totalDays += daysInMonth[i];
		}
		
		System.out.println(dayOfTheWeeks[totalDays % 7]);

		
	}

}
