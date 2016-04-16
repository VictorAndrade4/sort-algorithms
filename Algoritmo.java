/*
 * Essa classe foi feita para facilitar os testes de cada Algoritmo.
 * 
 */

public class Algoritmo{
	
	// Método que toda classe que herda de Algoritmo sobrescreve 
	public int[] sort(int[] arr){
		System.out.println("Nenhum método aplicado!!!");
		return arr;
	}
	
	// Troca. Para BubbleSort, SelectionSort e QuickSort
	public static void swap(int[] arr, int A, int B){
		int aux = arr[A];
		arr[A] = arr[B];
		arr[B] = aux;
	}
}
