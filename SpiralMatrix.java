
public class SpiralMatrix {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int m = arr.length;
		int n = arr[0].length;
		int minRow=0, maxRow=m-1;
		int minCol=0, maxCol=n-1;
		
		while(minRow<=maxRow && minCol<=maxCol){
		
		    for(int j=minCol; j<=maxCol; j++){
		        System.out.print(arr[minRow][j]+" ");
		    }minRow++;
		
		    if(minRow>maxRow || minCol>maxCol) break;
		    for(int i=minRow; i<=maxRow; i++){
		    	System.out.print(arr[i][maxCol]+" ");
		    }maxCol--;
		
		    if(minRow>maxRow || minCol>maxCol) break;
		    for(int j=maxCol;j>=minCol;j--){
		    	System.out.print(arr[maxRow][j]+" ");
		    }maxRow--;
		
		    if(minRow>maxRow || minCol>maxCol) break;
		    for(int i=maxRow; i>=minRow; i--){
		    	System.out.print(arr[i][minCol]+" ");
		    }minCol++;

		}
	}

}
