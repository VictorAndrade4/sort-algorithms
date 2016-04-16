public class Selection extends Algoritmo{
	public int[] sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			swap(arr, min, i);
		}
		
		return arr;
	}
}
