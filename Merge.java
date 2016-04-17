public class Merge extends Algoritmo {
	public int[] sort(int[] arr){
		mergeSort(arr, 0, arr.length-1);		
		return  arr;
	}
	
	private static void mergeSort(int[] arr, int p, int r){
		if(p<r){
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			
			merge(arr, p, q, r);
		}
	}
		
	private static void merge(int[] arr, int p, int q, int r){
		int tamEsq = q-p+1;
		int tamDir = r-q;
		
		int[] esq = new int[tamEsq +1];
		int[] dir = new int[tamDir +1];
		
		for(int i=0; i<tamEsq; i++) esq[i] = arr[p+i];
		for(int j=0; j<tamDir; j++) dir[j] = arr[q+j+1];
		
		// Critério de parada
		esq[tamEsq] = Integer.MAX_VALUE; 
		dir[tamDir] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for(int k=p; k<=r; k++){
			if(esq[i] < dir[j]) arr[k] = esq[i++];
			else arr[k] = dir[j++];
		}
	}
}