public class Quick extends Algoritmo {
	public int[] sort(int[] arr){
		quicksort(arr, 0, arr.length-1);
		return arr;
	}
	
	public static void quicksort(int arr[], int inicio, int fim) {
		 if (inicio < fim){ 
			int posicaoPivo = particao(arr, inicio, fim);
		 	quicksort(arr, inicio, posicaoPivo - 1);
		 	quicksort(arr, posicaoPivo + 1, fim);
		 }
	}
	
	
	private static int particao(int arr[], int inicio, int fim) {
		 int pivo = arr[inicio];
		 int i = inicio + 1, f = fim;
		 while (	i <= f){
			 if (arr[i] <= pivo){
				 i++;
		 	 }
			 else if (pivo < arr[f]){
				 f--;
			 }
			 else{
				 swap(arr, i, f);
				 i++;
				 f--;
			 }
		 }
		 arr[inicio] = arr[f];
		 arr[f] = pivo;
		 return f;

	}
}
