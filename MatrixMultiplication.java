
public class MatrixMultiplication {
	
	public static void print(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [][] a = {{1,2,3,},{4,5,6}};
		int [][] b = {{1,2},{3,4},{5,6}};
		
		if(a[0].length != b.length) {
			System.out.println("multiplication not possible");
		}
		else {
			int[][] c = new int[a.length][b[0].length];
			for(int i=0;i<c.length;i++) {
				for(int j=0; j<c[0].length;j++) {
					//c[i][j]=a[i][k]*b[k][j]
					for(int k=0;k<b.length;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			print(a);
			print(b);
			print(c);
		}
	}

}
