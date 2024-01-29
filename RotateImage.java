
public class RotateImage {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		print(arr);

		//Transpose Array
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<i;j++){
				int temp = arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	         }
		}

		//Reverse Array
		for(int i=0; i<arr.length;i++){
			int low = 0, high=arr.length-1;
	        while(low<high){
	        	int temp=arr[i][low];
	            arr[i][low]=arr[i][high];
	            arr[i][high]=temp;
	            low++;
	            high--;
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
}
