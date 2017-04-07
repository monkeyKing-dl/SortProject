
public class MergeSort {
	public static void main(String[] args) {
		int a[] = new int[]{4,2,6,3,8,9,5,6,7,34,67,1,23,555};
		mergeSort(a);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]).append(",");
		}
		System.out.println(sb.toString());
	}
	
	public static void mergeSort(int[] arrays){
		int length = arrays.length;
		int left = 0;
		int end = length-1;
		divideSort(arrays, left, end);
	}
	
	private static void divideSort(int arrays[],int left,int end){
		if(left >= end){
			return;
		}
		int middle = (left + end)/2;
		divideSort(arrays, left, middle);
		divideSort(arrays, middle+1, end);
		combine(arrays,left,middle,end);
		
	}
	
	private static void combine(int[] arrays,int left,int middle,int end) {
		int[] results = new int[arrays.length];
		int leftNum = 0;
		int rightNum =middle + 1;
		int totalNum = 0;
		while (leftNum <= middle && rightNum <= end){
			results[totalNum++] = arrays[leftNum] < arrays[rightNum] ? arrays[leftNum++] : arrays[rightNum++];
		}
		while (leftNum <= middle){
			results[totalNum++] = arrays[leftNum++];
		}
		while(rightNum <= end){
			results[totalNum++] = arrays[rightNum++];
		}
		for(int i=0;i<totalNum;i++){
			arrays[i] = results[i];
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arrays.length;i++){
			sb.append(arrays[i]).append(",");
		}
		System.out.println(sb.toString());
	}
}
