package ClassWork;

public class twoDArray {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2},
				{3,4}
		};
		
		int[][] a = {{15,25,35},{45,55,65}};
		int[][] b = {{75,85,95},{5,15,25}};
		int[][] sum = new int[2][3];
		
		for (int i =0;i < 2;i++) {
			for (int j =0;j < 2;j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int ii =0;ii < a.length ;ii++) {
			for (int jj =0;jj < a[0].length;jj++) {
				sum[ii][jj] = a[ii][jj]+b[ii][jj];
			}
			System.out.println();
		}
		
		for (int ii =0;ii < a.length ;ii++) {
			for (int jj =0;jj < a[0].length;jj++) {
				System.out.format("%d \t", sum[ii][jj]);
			}
			System.out.println();
		}

	}

}
