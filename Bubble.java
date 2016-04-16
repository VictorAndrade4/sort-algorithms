public class Bubble extends Algoritmo{
	public int[] sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}	
}
