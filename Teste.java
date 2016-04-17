import java.util.Random;

public class Teste {
	
	/* Ex: arrayTeste(10, 100); 
	 * => Retorna um array de tamanho 10, que possui numeros de 0 a (10-1) carregados com a semente constante=1.
	 * Ou seja, todos os testes com essa semente trabalharão o mesmo array.
	*/
	private static int[] arrayTeste(int quantidade, int seedmax){
		Random gerador = new Random(1);
		int[] arr = new int[quantidade];
		for(int i=0; i<quantidade; i++){
			arr[i] = gerador.nextInt(seedmax) ; // Array formado apenas por numeros menores que max.
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
	public static int[] testar(Algoritmo algoritmo, int quantidade, int seedmax){
		int[] arr = arrayTeste(quantidade, seedmax); // Um novo array com dados aleatórios é criado a cada chamada.
		long tempoInicial = System.nanoTime();
		
		System.out.println("Teste --> "+ String.valueOf(algoritmo.getClass() ) );
		algoritmo.sort(arr);
		long tempoFinal = System.nanoTime();
		System.out.println(("Execução: "+ (tempoFinal - tempoInicial)/Math.pow(10,9)+" s\n")); // Conversão de nanossegundos para segundos
		return arr;
	}
	
	// Este método imprime o array ordenado, além de testar o algoritmo
	public static void testarPrint(Algoritmo algoritmo, int quantidade, int seedmax){
		int[] arr = testar(algoritmo, quantidade, seedmax);
		arrayPrint(arr);
	}

	
	
	
			public static void main(String[] args) {		
				Algoritmo bubble = new Bubble();
				Algoritmo selection = new Selection();
				Algoritmo insertion = new Insertion();
				Algoritmo quick = new Quick();
				Algoritmo merge = new Merge();
				
				System.out.println("---------> Primeira Etapa: ");
				System.out.println("Arrays de tamanho 100 e valores até 100\n");
				testarPrint(bubble, 100, 100);
				testarPrint(selection, 100, 100);
				testarPrint(insertion, 100, 100);
				testarPrint(quick, 100, 100);
				testarPrint(merge, 100, 100);
				
				System.out.print("---------> Segunda Etapa: ");
				System.out.print("Arrays de tamanho 10.000 a 90.000\n");
				for(int i=1; i<10; i++){
					System.out.println("\n->>>"+i*(int)Math.pow(10,4));
					testar(bubble, i*(int)Math.pow(10,4), i*(int)Math.pow(10,4));
					testar(selection, i*(int)Math.pow(10,4), i*(int)Math.pow(10,4));
					testar(insertion, i*(int)Math.pow(10,4), i*(int)Math.pow(10,4));
					testar(quick, i*(int)Math.pow(10,4), i*(int)Math.pow(10,4));
					testar(merge, i*(int)Math.pow(10,4), i*(int)Math.pow(10,4));
				}
				
				System.out.print("---------> Terceira Etapa: ");
				System.out.println("Arrays de tamanho 100.000 a 1.000.000\n");
				for(int i=1; i < 11; i++){
					System.out.println("\n->>>"+i*(int)Math.pow(10,5));
					testar(bubble, i*(int)Math.pow(10,5), i*(int)Math.pow(10,5));
					testar(selection, i*(int)Math.pow(10,5), i*(int)Math.pow(10,5));
					testar(insertion, i*(int)Math.pow(10,5), i*(int)Math.pow(10,5));
					testar(quick, i*(int)Math.pow(10,5), i*(int)Math.pow(10,5));
					testar(merge, i*(int)Math.pow(10,5), i*(int)Math.pow(10,5));
				}
				
			}
			
}
