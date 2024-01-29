
public class TransposeArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2},{3,4},{5,6}};
		int m = arr.length;
		int n = arr[0].length;
		
		System.out.println("Original Array: ");
		for(int i=0; i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] trans = new int[n][m];
		
		System.out.println("Transpose Matrix: ");
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				trans[i][j]=arr[j][i];
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
