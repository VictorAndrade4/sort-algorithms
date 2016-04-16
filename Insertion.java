public class Insertion extends Algoritmo {
	public int[] sort(int[] arr){
		int j = 1;
		
		while(j < arr.length){
			int chave = arr[j];
			int i = j-1;
			while(i>=0 && arr[i]>chave){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = chave;
			j++;
		}		
		return arr;
	}
}
