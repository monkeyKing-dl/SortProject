
public class QuickSort2 {

	public static void main(String[] args) {
		int a[] = new int[]{5,2,6,3,8,9,5,6,7,34,67,555,23,1};
		quickSort(a);
		
	}
	
	public static void quickSort(int[] arrays){
		partition(arrays, 0, arrays.length-1);
		printArrays(arrays);
	}
	
	public static void partition(int[] arrays,int start,int end){
		if(start >= end){
			return;
		}
		int leftStart = start;
		int rightEnd = end-1;
		//int middle = end;
		int middleValue = arrays[end];
		while(leftStart < rightEnd){
			while((arrays[leftStart] <= middleValue) && (leftStart < rightEnd)){
				leftStart ++;
			}
			while((arrays[rightEnd] >= middleValue) && (leftStart < rightEnd)){
				rightEnd --;
			}
			
			//arrays[rightEnd] = arrays[leftStart];
			swap(arrays, leftStart, rightEnd);
		}
		if(arrays[leftStart] >= arrays[end]){
			swap(arrays, leftStart, end);
		}else {
			//维基百科上有这一步，但是我没有理解这一步++的必要性
			//leftStart++;
		}
		//arrays[leftStart] = middleValue;
		printArrays(arrays);
		//middle = leftStart;
		partition(arrays, start, leftStart-1);
		partition(arrays, leftStart+1, end);
	}
	
	public static void swap(int[] arrays,int x,int y){
		int temp = arrays[x];
		arrays[x] = arrays[y];
		arrays[y] = temp;
	}
	
	
	public static void printArrays(int[] a){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]).append(",");
		}
		System.out.println(sb.toString());
	}

}
