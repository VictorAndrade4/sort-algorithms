import java.util.Random;

public class Teste {

	private static int[] arrayTeste(int quantidade, int max){
		Random gerador = new Random();
		int[] arr = new int[quantidade];
		for(int i=0; i<quantidade; i++){
			arr[i] = gerador.nextInt(max) ; // Array formado apenas por numeros menores que max
		}
		return arr;
	}
	private static void arrayPrint(int[] arr){
		for(int i=0;i<arr.length;i++){
			if (i == arr.length-1) System.out.print(arr[i]+"\n");
			else System.out.print(arr[i]+", ");
		}
	}

	// Teste dos algoritmos de ordenação
	public static int[] testar(Algoritmo algoritmo, int quantidade, int max){
		int[] arr = arrayTeste(quantidade, max); // Um novo array com dados aleatórios é criado a cada chamada.
		long tempoInicial = System.nanoTime();
		
		System.out.println("Teste --> "+ String.valueOf(algoritmo.getClass() ) );
		algoritmo.sort(arr);
		long tempoFinal = System.nanoTime();
		System.out.println(("Execução: "+ (tempoFinal - tempoInicial)/Math.pow(10,3)+" ms\n")); // Conversão de nanossegundos para mili
		return arr;
	}
	
	// Este método imprime o array ordenado, além de testar o algoritmo
	public static void testarPrint(Algoritmo algoritmo, int quantidade, int max){
		int[] arr = testar(algoritmo, quantidade, max);
		arrayPrint(arr);
	}

	
	
	
			public static void main(String[] args) {		
				Algoritmo bubble = new Bubble();
				Algoritmo selection = new Selection();
				Algoritmo insertion = new Insertion();
				Algoritmo quick = new Quick();
				Algoritmo merge = new Merge();
				
				/*
				System.out.print("---------> Primeira Bateria: ");
				System.out.println("Arrays com tamanho 100 e valores até 100\n");
				testarPrint(bubble, 100, 100);
				testarPrint(selection, 100, 100);
				testarPrint(insertion, 100, 100);
				testarPrint(quick, 100, 100);
				*/
				testarPrint(merge, 100, 100);
				
				
				System.out.print("---------> Testes automáticos. ");
				System.out.println("Arrays de tamanho 10 a 1.000.000");
				//for(int i=1; i < 7; i++) testar(bubble, (int)Math.pow(10,i), (int)Math.pow(10,i));
				//for(int i=1; i < 7; i++) testar(selection, (int)Math.pow(10,i), (int)Math.pow(10,i));
				//for(int i=1; i < 7; i++) testar(insertion, (int)Math.pow(10,i), (int)Math.pow(10,i));
				//for(int i=1; i < 7; i++) testar(quick, (int)Math.pow(10,i), (int)Math.pow(10,i));
				//for(int i=1; i < 7; i++) testar(merge, (int)Math.pow(10,i), (int)Math.pow(10,i));
				
			}
			
}
