
public class SelectionArray {
	public static void print(int[] arr) {
		for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,2,1,3,4};
		print(arr);
		
		int x = 0;
		for(int i=0; i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			int mindx = -1;
			for(int j=0; j<arr.length;j++) {
				if(arr[j] < min && arr[j]>0) {
					min=arr[j];
					mindx=j;
				}
			}
			arr[mindx]=x;
			x--;
		}
		print(arr);
		
		for(int i=0; i<arr.length;i++) {
			arr[i]*=-1;
		}
		print(arr);
	}

}
