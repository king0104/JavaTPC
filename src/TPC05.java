

public class TPC05 {

	public static void main(String[] args) {
		
		// 1차원 배열
		int []a = new int[3];
		a[0] = 10;
		a[1]=20;
		a[2]=30;
		int sum =0;
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);

		// 2차원 배열
		int[][]b = new int[3][3];
		
		for(int i=0;i<b.length;i++) { // 1. 동
			for(int j=0;j<b[i].length;j++) { // 2. 층
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}

		// 가변길이 배열 - 동을 미리 지정
		int[][] star=new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				star[i][j] = '*';
				System.out.print((char)star[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	

	
}
