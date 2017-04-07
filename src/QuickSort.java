
public class QuickSort {

	public static void main(String[] args) {
		int a[] = new int[]{4,2,6,3,8,9,5,6,7,34,67,1,23,555};
		quickSort(a);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]).append(",");
		}
		System.out.println(sb.toString());
	}
	
	public static void quickSort(int[] arrays){
		partition(arrays, 0, arrays.length -1);
	}
	
	public static void partition(int[] arrays,int start,int end){
		if(start >= end){
			return;
		}
		
		int middle = (start + end)/2;
		int leftStart = start;
		int rightEnd = end;
		while (leftStart <middle && rightEnd > middle){
			while(arrays[leftStart] < arrays[middle] && leftStart < middle){
				leftStart ++;
			}
			while (arrays[rightEnd] > arrays[middle] && rightEnd > middle){
				rightEnd -- ;
			}
			
			if(leftStart < middle && rightEnd > middle){
				int temp = arrays[leftStart];
				arrays[leftStart] = arrays[rightEnd];
				arrays[rightEnd] = temp;
			}
		}
		if(leftStart >= middle){
			int temp = arrays[rightEnd];
			arrays[rightEnd] = arrays[middle];
			arrays[middle] = temp;
			middle = rightEnd;
		}else {
			int temp = arrays[leftStart];
			arrays[leftStart] = arrays[middle];
			arrays[middle] = temp;
			middle = leftStart;
		}
		SortTools.printArrays(arrays);
		partition(arrays, start, middle-1);
		partition(arrays, middle+1, end);
	}

}
