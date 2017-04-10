
public class HeapSort {

	//最大堆
	public static void main(String[] args) {
		int a[] = new int[]{4,2,6,3,8,9,5,6,7,34,67,1,23,555};
		heapSort(a);
	}
	
	public static void heapSort(int[] arrays){
		makeHeap(arrays,arrays.length-1);
		for(int i=arrays.length -1;i>0;i--){
			SortTools.swap(arrays, 0, i);
			makeHeap(arrays, i-1);
		}
		
		SortTools.printArrays(arrays);
	}
	
	/**
	 * 将数组堆化
	 * @param arrays
	 */
	public static void makeHeap(int[] arrays,int end){
		int n = (end - 1)/2;
		for(int i=n;i>=0;i--){
			fixHeap(arrays, i,end);
		}
	}
	
	
	public static void fixHeap(int[] arrays,int n,int end){
		int maxN = end;
		int leftChild = 0;
		int rightChild = 0;
		if(n < maxN){
			leftChild = 2*n + 1;
			if(leftChild <= maxN){
				if(arrays[n] < arrays[leftChild]){
					SortTools.swap(arrays, leftChild, n);
					fixHeap(arrays, leftChild,end);
				}
				
			}
			rightChild = 2*n + 2;
			if(rightChild <= maxN){
				if(arrays[n] < arrays[rightChild]){
					SortTools.swap(arrays, rightChild, n);
					fixHeap(arrays, rightChild,end);
				}
				
			}
		}
	}
	
	

}
