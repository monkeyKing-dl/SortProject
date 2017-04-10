
public class BubbleSort {

	public static void main(String[] args) {
		int a[] = new int[]{4,2,6,3,8,9,5,6,7,34,67,1,23,555};
		bubbleSort(a);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]).append(",");
		}
		System.out.println(sb.toString());
	}
	
	public static void bubbleSort(int[] arrays){
		int length = arrays.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1-i;j++){
				if(arrays[j] > arrays[j+1]){
					int temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			}
		}
	}

}
