
public class SortTools {
	public static void  printArrays(int[] arrays){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arrays.length ;i ++){
			sb.append(arrays[i]).append(",");
		}
		System.out.println(sb.toString());
	}
}
