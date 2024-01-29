
public class TransformToTranspose {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		print(arr);
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<i;j++) {
				swap(arr,i,j);
			}
		}
		print(arr);
	}
	
	public static void print(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i]= temp;
	}
}
